package com.medicine.app;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class medicine_duo_Impl implements medicine_duo {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<medicine_entity> __insertionAdapterOfmedicine_entity;

  private final EntityDeletionOrUpdateAdapter<medicine_entity> __deletionAdapterOfmedicine_entity;

  private final EntityDeletionOrUpdateAdapter<medicine_entity> __updateAdapterOfmedicine_entity;

  public medicine_duo_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfmedicine_entity = new EntityInsertionAdapter<medicine_entity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `medicine_entity` (`id`,`name`,`medicine_type`,`mobile`,`batch`,`expiry_dt`,`manufacture_dt`,`stock`,`location`,`img_path`,`desc`,`seller_name`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, medicine_entity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getMedicine_type() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMedicine_type());
        }
        if (value.getMobile() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMobile());
        }
        if (value.getBatch() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBatch());
        }
        if (value.getExpiry_dt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getExpiry_dt());
        }
        if (value.getManufacture_dt() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getManufacture_dt());
        }
        if (value.getStock() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStock());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLocation());
        }
        if (value.getImg_path() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getImg_path());
        }
        if (value.getDesc() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getDesc());
        }
        if (value.getSeller() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getSeller());
        }
      }
    };
    this.__deletionAdapterOfmedicine_entity = new EntityDeletionOrUpdateAdapter<medicine_entity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `medicine_entity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, medicine_entity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfmedicine_entity = new EntityDeletionOrUpdateAdapter<medicine_entity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `medicine_entity` SET `id` = ?,`name` = ?,`medicine_type` = ?,`mobile` = ?,`batch` = ?,`expiry_dt` = ?,`manufacture_dt` = ?,`stock` = ?,`location` = ?,`img_path` = ?,`desc` = ?,`seller_name` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, medicine_entity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getMedicine_type() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMedicine_type());
        }
        if (value.getMobile() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMobile());
        }
        if (value.getBatch() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBatch());
        }
        if (value.getExpiry_dt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getExpiry_dt());
        }
        if (value.getManufacture_dt() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getManufacture_dt());
        }
        if (value.getStock() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStock());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLocation());
        }
        if (value.getImg_path() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getImg_path());
        }
        if (value.getDesc() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getDesc());
        }
        if (value.getSeller() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getSeller());
        }
        if (value.getId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getId());
        }
      }
    };
  }

  @Override
  public void insert(final medicine_entity val) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfmedicine_entity.insert(val);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final medicine_entity val) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfmedicine_entity.handle(val);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final medicine_entity task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfmedicine_entity.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<medicine_entity> getAll() {
    final String _sql = "SELECT * FROM medicine_entity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfMedicineType = CursorUtil.getColumnIndexOrThrow(_cursor, "medicine_type");
      final int _cursorIndexOfMobile = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile");
      final int _cursorIndexOfBatch = CursorUtil.getColumnIndexOrThrow(_cursor, "batch");
      final int _cursorIndexOfExpiryDt = CursorUtil.getColumnIndexOrThrow(_cursor, "expiry_dt");
      final int _cursorIndexOfManufactureDt = CursorUtil.getColumnIndexOrThrow(_cursor, "manufacture_dt");
      final int _cursorIndexOfStock = CursorUtil.getColumnIndexOrThrow(_cursor, "stock");
      final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
      final int _cursorIndexOfImgPath = CursorUtil.getColumnIndexOrThrow(_cursor, "img_path");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfSeller = CursorUtil.getColumnIndexOrThrow(_cursor, "seller_name");
      final List<medicine_entity> _result = new ArrayList<medicine_entity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final medicine_entity _item;
        _item = new medicine_entity();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpMedicine_type;
        _tmpMedicine_type = _cursor.getString(_cursorIndexOfMedicineType);
        _item.setMedicine_type(_tmpMedicine_type);
        final String _tmpMobile;
        _tmpMobile = _cursor.getString(_cursorIndexOfMobile);
        _item.setMobile(_tmpMobile);
        final String _tmpBatch;
        _tmpBatch = _cursor.getString(_cursorIndexOfBatch);
        _item.setBatch(_tmpBatch);
        final String _tmpExpiry_dt;
        _tmpExpiry_dt = _cursor.getString(_cursorIndexOfExpiryDt);
        _item.setExpiry_dt(_tmpExpiry_dt);
        final String _tmpManufacture_dt;
        _tmpManufacture_dt = _cursor.getString(_cursorIndexOfManufactureDt);
        _item.setManufacture_dt(_tmpManufacture_dt);
        final String _tmpStock;
        _tmpStock = _cursor.getString(_cursorIndexOfStock);
        _item.setStock(_tmpStock);
        final String _tmpLocation;
        _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
        _item.setLocation(_tmpLocation);
        final String _tmpImg_path;
        _tmpImg_path = _cursor.getString(_cursorIndexOfImgPath);
        _item.setImg_path(_tmpImg_path);
        final String _tmpDesc;
        _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        _item.setDesc(_tmpDesc);
        final String _tmpSeller;
        _tmpSeller = _cursor.getString(_cursorIndexOfSeller);
        _item.setSeller(_tmpSeller);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<medicine_entity> findMed(final String name, final String location) {
    final String _sql = "SELECT * FROM medicine_entity WHERE name like '%'||?||'%' and location like '%'||?||'%' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    _argIndex = 2;
    if (location == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, location);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfMedicineType = CursorUtil.getColumnIndexOrThrow(_cursor, "medicine_type");
      final int _cursorIndexOfMobile = CursorUtil.getColumnIndexOrThrow(_cursor, "mobile");
      final int _cursorIndexOfBatch = CursorUtil.getColumnIndexOrThrow(_cursor, "batch");
      final int _cursorIndexOfExpiryDt = CursorUtil.getColumnIndexOrThrow(_cursor, "expiry_dt");
      final int _cursorIndexOfManufactureDt = CursorUtil.getColumnIndexOrThrow(_cursor, "manufacture_dt");
      final int _cursorIndexOfStock = CursorUtil.getColumnIndexOrThrow(_cursor, "stock");
      final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
      final int _cursorIndexOfImgPath = CursorUtil.getColumnIndexOrThrow(_cursor, "img_path");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfSeller = CursorUtil.getColumnIndexOrThrow(_cursor, "seller_name");
      final List<medicine_entity> _result = new ArrayList<medicine_entity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final medicine_entity _item;
        _item = new medicine_entity();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpMedicine_type;
        _tmpMedicine_type = _cursor.getString(_cursorIndexOfMedicineType);
        _item.setMedicine_type(_tmpMedicine_type);
        final String _tmpMobile;
        _tmpMobile = _cursor.getString(_cursorIndexOfMobile);
        _item.setMobile(_tmpMobile);
        final String _tmpBatch;
        _tmpBatch = _cursor.getString(_cursorIndexOfBatch);
        _item.setBatch(_tmpBatch);
        final String _tmpExpiry_dt;
        _tmpExpiry_dt = _cursor.getString(_cursorIndexOfExpiryDt);
        _item.setExpiry_dt(_tmpExpiry_dt);
        final String _tmpManufacture_dt;
        _tmpManufacture_dt = _cursor.getString(_cursorIndexOfManufactureDt);
        _item.setManufacture_dt(_tmpManufacture_dt);
        final String _tmpStock;
        _tmpStock = _cursor.getString(_cursorIndexOfStock);
        _item.setStock(_tmpStock);
        final String _tmpLocation;
        _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
        _item.setLocation(_tmpLocation);
        final String _tmpImg_path;
        _tmpImg_path = _cursor.getString(_cursorIndexOfImgPath);
        _item.setImg_path(_tmpImg_path);
        final String _tmpDesc;
        _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        _item.setDesc(_tmpDesc);
        final String _tmpSeller;
        _tmpSeller = _cursor.getString(_cursorIndexOfSeller);
        _item.setSeller(_tmpSeller);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
