package com.example.citysproject.data.local;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.citysproject.data.model.City;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CityDao_Impl implements CityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<City> __insertionAdapterOfCity;

  public CityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCity = new EntityInsertionAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `city` (`name`,`country`,`subRegion`,`capital`,`area`,`flag`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountry());
        }
        if (value.getSubRegion() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSubRegion());
        }
        if (value.getCapital() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCapital());
        }
        if (value.getArea() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getArea());
        }
        if (value.getFlag() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFlag());
        }
      }
    };
  }

  @Override
  public void InsertPublications(final List<City> data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCity.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<City> fetchFavorites() {
    final String _sql = "SELECT * FROM city";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfSubRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "subRegion");
      final int _cursorIndexOfCapital = CursorUtil.getColumnIndexOrThrow(_cursor, "capital");
      final int _cursorIndexOfArea = CursorUtil.getColumnIndexOrThrow(_cursor, "area");
      final int _cursorIndexOfFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "flag");
      final List<City> _result = new ArrayList<City>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final City _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpCountry;
        _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        final String _tmpSubRegion;
        _tmpSubRegion = _cursor.getString(_cursorIndexOfSubRegion);
        final String _tmpCapital;
        _tmpCapital = _cursor.getString(_cursorIndexOfCapital);
        final String _tmpArea;
        _tmpArea = _cursor.getString(_cursorIndexOfArea);
        final String _tmpFlag;
        _tmpFlag = _cursor.getString(_cursorIndexOfFlag);
        _item = new City(_tmpName,_tmpCountry,_tmpSubRegion,_tmpCapital,_tmpArea,_tmpFlag);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
