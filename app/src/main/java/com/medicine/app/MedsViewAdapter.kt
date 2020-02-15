package com.medicine.app

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class MedsViewAdapter(val mList: List<medicine_entity>, val mCallBack: MedClick) :
    RecyclerView.Adapter<MedsViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.inflate_med_view_adapter, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imgUri: Uri = Uri.parse(mList[position].img_path)
        holder.mImage.setImageURI(imgUri)
        holder.mName.text = mList[position].name
        holder.mLocation.text = mList[position].location
        holder.mRootLay.setOnClickListener {
            mCallBack.itemClick(position)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mImage: ImageView = itemView.findViewById(R.id.med_img)
        val mName: TextView = itemView.findViewById(R.id.med_name)
        val mLocation: TextView = itemView.findViewById(R.id.med_location)
        val mRootLay: CardView = itemView.findViewById(R.id.rootLay)
    }


}

