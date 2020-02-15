package com.medicine.app;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface medicine_duo {

    @Query("SELECT * FROM medicine_entity")
    List<medicine_entity> getAll();

    @Query("SELECT * FROM medicine_entity WHERE name like '%'||:name||'%' and location like '%'||:location||'%' ")
    List<medicine_entity> findMed(String name, String location);

    @Insert
    void insert(medicine_entity val);

    @Delete
    void delete(medicine_entity val);

    @Update
    void update(medicine_entity task);

}