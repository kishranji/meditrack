package com.medicine.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_med_detail.*

class MedDetail : AppCompatActivity() {

    lateinit var mValue: medicine_entity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_med_detail)

        val i = intent
        mValue = i.getSerializableExtra("value") as medicine_entity

        medicineName.text = mValue.name!!.toEditable()
        type.text = mValue.medicine_type!!.toEditable()
        batchNo.text = mValue.batch!!.toEditable()
        mobile.text = mValue.mobile!!.toEditable()
        expiry_date.text = mValue.expiry_dt!!.toEditable()
        manufacture_date.text = mValue.manufacture_dt!!.toEditable()
        no_of_meds.text = mValue.stock!!.toEditable()
        val imgUri: Uri = Uri.parse(mValue.img_path!!)
        med_image.setImageURI(imgUri)
        location.text = mValue.location!!.toEditable()
        seller_name.text = mValue.seller!!.toEditable()
        desc.text = mValue.desc!!.toEditable()


        call.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + mValue.mobile!!)
            startActivity(intent)
        }

    }

    fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)
}
