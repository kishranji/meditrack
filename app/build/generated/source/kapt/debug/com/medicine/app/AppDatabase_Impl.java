package com.medicine.app;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile medicine_duo _medicineDuo;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `medicine_entity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `medicine_type` TEXT, `mobile` TEXT, `batch` TEXT, `expiry_dt` TEXT, `manufacture_dt` TEXT, `stock` TEXT, `location` TEXT, `img_path` TEXT, `desc` TEXT, `seller_name` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8fd3bf30708a995cc2ec245375d3169c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `medicine_entity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMedicineEntity = new HashMap<String, TableInfo.Column>(12);
        _columnsMedicineEntity.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("medicine_type", new TableInfo.Column("medicine_type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("mobile", new TableInfo.Column("mobile", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("batch", new TableInfo.Column("batch", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("expiry_dt", new TableInfo.Column("expiry_dt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("manufacture_dt", new TableInfo.Column("manufacture_dt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("stock", new TableInfo.Column("stock", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("location", new TableInfo.Column("location", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("img_path", new TableInfo.Column("img_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("desc", new TableInfo.Column("desc", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicineEntity.put("seller_name", new TableInfo.Column("seller_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMedicineEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMedicineEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMedicineEntity = new TableInfo("medicine_entity", _columnsMedicineEntity, _foreignKeysMedicineEntity, _indicesMedicineEntity);
        final TableInfo _existingMedicineEntity = TableInfo.read(_db, "medicine_entity");
        if (! _infoMedicineEntity.equals(_existingMedicineEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "medicine_entity(com.medicine.app.medicine_entity).\n"
                  + " Expected:\n" + _infoMedicineEntity + "\n"
                  + " Found:\n" + _existingMedicineEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8fd3bf30708a995cc2ec245375d3169c", "15c41f961cc71a80d94c8c3715637f25");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "medicine_entity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `medicine_entity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public medicine_duo taskDao() {
    if (_medicineDuo != null) {
      return _medicineDuo;
    } else {
      synchronized(this) {
        if(_medicineDuo == null) {
          _medicineDuo = new medicine_duo_Impl(this);
        }
        return _medicineDuo;
      }
    }
  }
}
