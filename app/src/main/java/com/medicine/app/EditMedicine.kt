package com.medicine.app

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.dhaval2404.imagepicker.ImagePicker
import kotlinx.android.synthetic.main.activity_edit_medicine.*
import java.io.File
import java.text.SimpleDateFormat
import java.util.*


class EditMedicine : AppCompatActivity() {

    lateinit var mValue: medicine_entity
    var cal = Calendar.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_medicine)

        val i = intent
        mValue = i.getSerializableExtra("value") as medicine_entity

        medicineName.text = mValue.name!!.toEditable()
        type.text = mValue.medicine_type!!.toEditable()
        batchNo.text = mValue.batch!!.toEditable()
        mobile.text = mValue.mobile!!.toEditable()
        expiry_date.text = mValue.expiry_dt!!.toEditable()
        manufacture_date.text = mValue.manufacture_dt!!.toEditable()
        no_of_meds.text = mValue.stock!!.toEditable()
        path.text = mValue.img_path!!.toEditable()
        location.text = mValue.location!!.toEditable()
        seller.text = mValue.seller!!.toEditable()
        desc.text = mValue.desc!!.toEditable()

        browse.setOnClickListener {
            ImagePicker.with(this)
                .crop()                    //Crop image(Optional), Check Customization for more option
                .compress(1024)            //Final image size will be less than 1 MB(Optional)
                .maxResultSize(
                    1080,
                    1080
                )    //Final image resolution will be less than 1080 x 1080(Optional)
                .start()
        }

        // create an OnDateSetListener
        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(
                view: DatePicker, year: Int, monthOfYear: Int,
                dayOfMonth: Int
            ) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val myFormat = "dd/MM/yyyy" // mention the format you need
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                expiry_date!!.text = sdf.format(cal.getTime()).toEditable()
            }
        }

        val dateSetManListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(
                view: DatePicker, year: Int, monthOfYear: Int,
                dayOfMonth: Int
            ) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val myFormat = "dd/MM/yyyy" // mention the format you need
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                manufacture_date!!.text = sdf.format(cal.getTime()).toEditable()
            }
        }

        // when you click on the button, show DatePickerDialog that is set with OnDateSetListener
        expiry_date!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                DatePickerDialog(
                    this@EditMedicine,
                    dateSetListener,
                    // set DatePickerDialog to point to today's date when it loads up
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)
                ).show()
            }

        })

        manufacture_date!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                DatePickerDialog(
                    this@EditMedicine,
                    dateSetManListener,
                    // set DatePickerDialog to point to today's date when it loads up
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)
                ).show()
            }

        })


        updateStockBtn.setOnClickListener {
            if (isValid()) {
                update()
            } else {
                Toast.makeText(this, "Please insert all the values", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            //Image Uri will not be null for RESULT_OK
            val fileUri = data?.data
            path.text = fileUri!!.path.toString().toEditable()
            //You can get File object from intent
            val file: File = ImagePicker.getFile(data)!!

            //You can also get File Path from intent
            val filePath: String = ImagePicker.getFilePath(data)!!
        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(this, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Task Cancelled", Toast.LENGTH_SHORT).show()
        }
    }


    fun isValid(): Boolean {
        return !medicineName.text.isNullOrEmpty() &&
                !type.text.isNullOrEmpty() &&
                !batchNo.text.isNullOrEmpty() &&
                !mobile.text.isNullOrEmpty() &&
                !expiry_date.text.isNullOrEmpty() &&
                !manufacture_date.text.isNullOrEmpty() &&
                !no_of_meds.text.isNullOrEmpty() &&
                !path.text.isNullOrEmpty() &&
                !seller.text.isNullOrEmpty() &&
                !desc.text.isNullOrEmpty() &&
                !location.text.isNullOrEmpty()
    }

    fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)

    private fun update() {
        val sName: String = medicineName.getText().toString().trim()
        val sType: String = type.getText().toString().trim()
        val sBatch: String = batchNo.getText().toString().trim()
        val sMob: String = mobile.getText().toString().trim()
        val sExp: String = expiry_date.getText().toString().trim()
        val sMan: String = manufacture_date.getText().toString().trim()
        val sNoOfMed: String = no_of_meds.getText().toString().trim()
        val sPath: String = path.getText().toString().trim()
        val sLocation: String = location.getText().toString().trim()
        val sSeller: String = seller.getText().toString().trim()
        val sDesc: String = desc.getText().toString().trim()


        class Update :
            AsyncTask<Void?, Void?, Void?>() {


            override fun onPostExecute(aVoid: Void?) {
                super.onPostExecute(aVoid)
                finish()
                Toast.makeText(applicationContext, "Updated", Toast.LENGTH_LONG).show()
            }

            override fun doInBackground(vararg params: Void?): Void? {

                val value = medicine_entity()
                value.id = mValue.id
                value.name = sName
                value.medicine_type = sType
                value.batch = sBatch
                value.mobile = sMob
                value.expiry_dt = sExp
                value.manufacture_dt = sMan
                value.stock = sNoOfMed
                value.img_path = sPath
                value.location = sLocation
                value.desc = sDesc
                value.seller = sSeller

                val db = DatabaseClient.getInstance(this@EditMedicine)!!.appDatabase
                db.taskDao()!!.update(value)
                return null
            }
        }

        val st = Update()
        st.execute()
    }
}
