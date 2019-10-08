package com.example.crud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "item.db";
    public static final String TABLE_NAME = "item_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "ACTIVIDAD";
    public static final String COL_3 = "ASUNTO";
    public static final String COL_4 = "FECHA";



    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, ACTIVIDAD, ASUNTO, FECHA)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);

    }

    public boolean insertData(String actividad, String asunto, String fecha ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, actividad);
        contentValues.put(COL_3, asunto);
        contentValues.put(COL_4, fecha);
        db.insert(TABLE_NAME, null, contentValues);
        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1){
            return false;
        }
        else {
            return true;
        }

        public Cursor getAllData();
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("Select * from " + TABLE_NAME,null);
            }

        }




    }
}
