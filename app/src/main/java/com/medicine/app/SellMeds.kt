package com.medicine.app

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_sell_meds.*


class SellMeds : AppCompatActivity(), MedClick {

    lateinit var medList: List<medicine_entity>
    lateinit var adapter: MedsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sell_meds)

        add_med.setOnClickListener {
            startActivity(Intent(this, AddMedicine::class.java))
        }
    }


    override fun onResume() {
        super.onResume()
        getMeds()
    }

    private fun getMeds() {
        class GetTasks :
            AsyncTask<Void?, Void?, List<medicine_entity>>() {

            override fun onPreExecute() {
                super.onPreExecute()
                progress.visibility = View.VISIBLE
            }


            override fun onPostExecute(tasks: List<medicine_entity>) {
                super.onPostExecute(tasks)

                if (tasks.size > 0) {
                    medList = tasks
                    adapter = MedsAdapter(medList, this@SellMeds)
                    val rv = findViewById<RecyclerView>(R.id.medRv)
                    rv.layoutManager = GridLayoutManager(this@SellMeds, 2)
                    rv.adapter = adapter
                } else {
                    Toast.makeText(this@SellMeds, "No Records found", Toast.LENGTH_SHORT).show()
                }
                progress.visibility = View.GONE
            }

            override fun doInBackground(vararg params: Void?): List<medicine_entity> {
                return DatabaseClient
                    .getInstance(this@SellMeds)!!
                    .appDatabase
                    .taskDao()!!
                    .getAll()
            }
        }

        val gt = GetTasks()
        gt.execute()
    }


    private fun delete(value: medicine_entity) {

        class DeleteTask :
            AsyncTask<Void?, Void?, Void?>() {


            override fun onPostExecute(aVoid: Void?) {
                super.onPostExecute(aVoid)
                getMeds()
                Toast.makeText(applicationContext, "Deleted", Toast.LENGTH_LONG).show()
            }

            override fun doInBackground(vararg params: Void?): Void? {

                val db = DatabaseClient.getInstance(this@SellMeds)!!.appDatabase
                db.taskDao()!!.delete(value)
                return null
            }
        }

        val st = DeleteTask()
        st.execute()
    }

    override fun deleteClick(postition: Int) {


        val builder = AlertDialog.Builder(this)

        //set title for alert dialog
        builder.setTitle(R.string.app_name)
        //set message for alert dialog
        builder.setMessage("Are you sure want to delete this medicine")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes") { dialogInterface, which ->
            adapter.notifyItemRemoved(postition)
            delete(medList[postition])
        }

        //performing negative action
        builder.setNegativeButton("Cancel") { dialogInterface, which ->
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(true)
        alertDialog.show()


    }

    override fun itemClick(postition: Int) {

        val intent = Intent(this, EditMedicine::class.java)
        intent.putExtra("value", medList[postition])
        startActivity(intent)
    }


}
