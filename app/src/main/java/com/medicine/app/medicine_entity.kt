package com.medicine.app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
class medicine_entity : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
    @ColumnInfo(name = "name")
    var name: String? = null
    @ColumnInfo(name = "medicine_type")
    var medicine_type: String? = null
    @ColumnInfo(name = "mobile")
    var mobile: String? = null
    @ColumnInfo(name = "batch")
    var batch: String? = null
    @ColumnInfo(name = "expiry_dt")
    var expiry_dt: String? = null
    @ColumnInfo(name = "manufacture_dt")
    var manufacture_dt: String? = null
    @ColumnInfo(name = "stock")
    var stock: String? = null
    @ColumnInfo(name = "location")
    var location: String? = null
    @ColumnInfo(name = "img_path")
    var img_path: String? = null
    @ColumnInfo(name = "desc")
    var desc: String? = null
    @ColumnInfo(name = "seller_name")
    var seller: String? = null
}