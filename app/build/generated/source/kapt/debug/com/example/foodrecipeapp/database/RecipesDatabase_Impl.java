package com.example.foodrecipeapp.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.foodrecipeapp.dao.RecipeDao;
import com.example.foodrecipeapp.dao.RecipeDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipesDatabase_Impl extends RecipesDatabase {
  private volatile RecipeDao _recipeDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Recipes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dishName` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CategoryItems` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idcategory` TEXT NOT NULL, `strcategory` TEXT NOT NULL, `strcategorythumb` TEXT NOT NULL, `strcategorydescription` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Category` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `categoryItems` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Meal` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `meals` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MealItems` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idMeal` TEXT NOT NULL, `categoryName` TEXT NOT NULL, `strmeal` TEXT NOT NULL, `strmealthumb` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '47822e0948dbde2b09d40ef1ece027e6')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Recipes`");
        _db.execSQL("DROP TABLE IF EXISTS `CategoryItems`");
        _db.execSQL("DROP TABLE IF EXISTS `Category`");
        _db.execSQL("DROP TABLE IF EXISTS `Meal`");
        _db.execSQL("DROP TABLE IF EXISTS `MealItems`");
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
        final HashMap<String, TableInfo.Column> _columnsRecipes = new HashMap<String, TableInfo.Column>(2);
        _columnsRecipes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("dishName", new TableInfo.Column("dishName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecipes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecipes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecipes = new TableInfo("Recipes", _columnsRecipes, _foreignKeysRecipes, _indicesRecipes);
        final TableInfo _existingRecipes = TableInfo.read(_db, "Recipes");
        if (! _infoRecipes.equals(_existingRecipes)) {
          return new RoomOpenHelper.ValidationResult(false, "Recipes(com.example.foodrecipeapp.entities.Recipes).\n"
                  + " Expected:\n" + _infoRecipes + "\n"
                  + " Found:\n" + _existingRecipes);
        }
        final HashMap<String, TableInfo.Column> _columnsCategoryItems = new HashMap<String, TableInfo.Column>(5);
        _columnsCategoryItems.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoryItems.put("idcategory", new TableInfo.Column("idcategory", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoryItems.put("strcategory", new TableInfo.Column("strcategory", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoryItems.put("strcategorythumb", new TableInfo.Column("strcategorythumb", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoryItems.put("strcategorydescription", new TableInfo.Column("strcategorydescription", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategoryItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategoryItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategoryItems = new TableInfo("CategoryItems", _columnsCategoryItems, _foreignKeysCategoryItems, _indicesCategoryItems);
        final TableInfo _existingCategoryItems = TableInfo.read(_db, "CategoryItems");
        if (! _infoCategoryItems.equals(_existingCategoryItems)) {
          return new RoomOpenHelper.ValidationResult(false, "CategoryItems(com.example.foodrecipeapp.entities.CategoryItems).\n"
                  + " Expected:\n" + _infoCategoryItems + "\n"
                  + " Found:\n" + _existingCategoryItems);
        }
        final HashMap<String, TableInfo.Column> _columnsCategory = new HashMap<String, TableInfo.Column>(2);
        _columnsCategory.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("categoryItems", new TableInfo.Column("categoryItems", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategory = new TableInfo("Category", _columnsCategory, _foreignKeysCategory, _indicesCategory);
        final TableInfo _existingCategory = TableInfo.read(_db, "Category");
        if (! _infoCategory.equals(_existingCategory)) {
          return new RoomOpenHelper.ValidationResult(false, "Category(com.example.foodrecipeapp.entities.Category).\n"
                  + " Expected:\n" + _infoCategory + "\n"
                  + " Found:\n" + _existingCategory);
        }
        final HashMap<String, TableInfo.Column> _columnsMeal = new HashMap<String, TableInfo.Column>(2);
        _columnsMeal.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMeal.put("meals", new TableInfo.Column("meals", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMeal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMeal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMeal = new TableInfo("Meal", _columnsMeal, _foreignKeysMeal, _indicesMeal);
        final TableInfo _existingMeal = TableInfo.read(_db, "Meal");
        if (! _infoMeal.equals(_existingMeal)) {
          return new RoomOpenHelper.ValidationResult(false, "Meal(com.example.foodrecipeapp.entities.Meal).\n"
                  + " Expected:\n" + _infoMeal + "\n"
                  + " Found:\n" + _existingMeal);
        }
        final HashMap<String, TableInfo.Column> _columnsMealItems = new HashMap<String, TableInfo.Column>(5);
        _columnsMealItems.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealItems.put("idMeal", new TableInfo.Column("idMeal", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealItems.put("categoryName", new TableInfo.Column("categoryName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealItems.put("strmeal", new TableInfo.Column("strmeal", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealItems.put("strmealthumb", new TableInfo.Column("strmealthumb", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMealItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMealItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMealItems = new TableInfo("MealItems", _columnsMealItems, _foreignKeysMealItems, _indicesMealItems);
        final TableInfo _existingMealItems = TableInfo.read(_db, "MealItems");
        if (! _infoMealItems.equals(_existingMealItems)) {
          return new RoomOpenHelper.ValidationResult(false, "MealItems(com.example.foodrecipeapp.entities.MealsItems).\n"
                  + " Expected:\n" + _infoMealItems + "\n"
                  + " Found:\n" + _existingMealItems);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "47822e0948dbde2b09d40ef1ece027e6", "db31e6d294b7cf3212a670982bfb319a");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Recipes","CategoryItems","Category","Meal","MealItems");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Recipes`");
      _db.execSQL("DELETE FROM `CategoryItems`");
      _db.execSQL("DELETE FROM `Category`");
      _db.execSQL("DELETE FROM `Meal`");
      _db.execSQL("DELETE FROM `MealItems`");
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
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(RecipeDao.class, RecipeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public RecipeDao recipeDao() {
    if (_recipeDao != null) {
      return _recipeDao;
    } else {
      synchronized(this) {
        if(_recipeDao == null) {
          _recipeDao = new RecipeDao_Impl(this);
        }
        return _recipeDao;
      }
    }
  }
}
