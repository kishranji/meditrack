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
import kotlinx.android.synthetic.main.activity_add_medicine.*
import java.io.File
import java.text.SimpleDateFormat
import java.util.*


class AddMedicine : AppCompatActivity() {

    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_medicine)

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
                    this@AddMedicine,
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
                    this@AddMedicine,
                    dateSetManListener,
                    // set DatePickerDialog to point to today's date when it loads up
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)
                ).show()
            }

        })


        addStockBtn.setOnClickListener {
            if (isValid()) {
                saveTask()
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
                !mobileno.text.isNullOrEmpty() &&
                !expiry_date.text.isNullOrEmpty() &&
                !manufacture_date.text.isNullOrEmpty() &&
                !no_of_meds.text.isNullOrEmpty() &&
                !path.text.isNullOrEmpty() &&
                !seller.text.isNullOrEmpty() &&
                !desc.text.isNullOrEmpty() &&
                !location.text.isNullOrEmpty()
    }

    fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)


    private fun saveTask() {
        val sName: String = medicineName.getText().toString().trim()
        val sType: String = type.getText().toString().trim()
        val sBatch: String = batchNo.getText().toString().trim()
        val sMob: String = mobileno.getText().toString().trim()
        val sExp: String = expiry_date.getText().toString().trim()
        val sMan: String = manufacture_date.getText().toString().trim()
        val sNoOfMed: String = no_of_meds.getText().toString().trim()
        val sPath: String = path.getText().toString().trim()
        val sLocation: String = location.getText().toString().trim()
        val sSeller: String = seller.getText().toString().trim()
        val sDesc: String = desc.getText().toString().trim()


        class SaveTask :
            AsyncTask<Void?, Void?, Void?>() {


            override fun onPostExecute(aVoid: Void?) {
                super.onPostExecute(aVoid)
                finish()
                Toast.makeText(applicationContext, "Saved", Toast.LENGTH_LONG).show()
            }

            override fun doInBackground(vararg params: Void?): Void? {

                val value = medicine_entity()

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

                //adding to database
                val db = DatabaseClient.getInstance(this@AddMedicine)!!.appDatabase
                db.taskDao()!!.insert(value)
                return null
            }
        }

        val st = SaveTask()
        st.execute()
    }


}


