package com.medicine.app

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_buy_meds.*

class BuyMeds : AppCompatActivity(), MedClick {

    lateinit var medList: List<medicine_entity>
    lateinit var adapter: MedsViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_meds)

        search_edit_name.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                getMeds(search_edit_name.text.toString(), search_edit_location.text.toString())
            }

        })

        search_edit_location.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                getMeds(search_edit_name.text.toString(), search_edit_location.text.toString())
            }

        })


    }

    override fun onResume() {
        super.onResume()
        getMeds(search_edit_name.text.toString(), search_edit_location.text.toString())
    }


    private fun getMeds(search: String, location: String) {
        class GetTasks :
            AsyncTask<Void?, Void?, List<medicine_entity>>() {

            override fun onPreExecute() {
                super.onPreExecute()
            }


            override fun onPostExecute(tasks: List<medicine_entity>) {
                super.onPostExecute(tasks)

                if (tasks.size > 0) {
                    medList = tasks
                    adapter = MedsViewAdapter(medList, this@BuyMeds)
                    val rv = findViewById<RecyclerView>(R.id.medRv)
                    no_data.visibility = View.GONE
                    rv.visibility = View.VISIBLE
                    rv.layoutManager = GridLayoutManager(this@BuyMeds, 2)
                    rv.adapter = adapter
                } else {
                    val rv = findViewById<RecyclerView>(R.id.medRv)
                    rv.visibility = View.GONE
                    no_data.visibility = View.VISIBLE
                }
            }

            override fun doInBackground(vararg params: Void?): List<medicine_entity> {
                val db = DatabaseClient.getInstance(this@BuyMeds)!!.appDatabase


                return db.taskDao()!!.findMed(search, location)
            }
        }

        val gt = GetTasks()
        gt.execute()
    }

    override fun deleteClick(postition: Int) {

    }

    override fun itemClick(postition: Int) {
        val intent = Intent(this, MedDetail::class.java)
        intent.putExtra("value", medList[postition])
        startActivity(intent)
    }
}
