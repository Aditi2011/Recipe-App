package com.example.bonappetite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBmanager extends SQLiteOpenHelper {
    private static final String dbname = "dbrecipe";

    public DBmanager(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String qry = "create table tbl_recipe ( id integer primary key autoincrement, recname text, recdetails text)";
        sqLiteDatabase.execSQL(qry);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String qry = "DROP TABLE IF EXISTS tbl_recipe";
        sqLiteDatabase.execSQL(qry);
        onCreate(sqLiteDatabase);
    }

    public String addrecord(String name, String details) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("recname", name);
        cv.put("recdetails", details);
        float res = db.insert("tbl_recipe", null, cv);

        if (res == -1)
            return "Failed";
        else
            return "Successfully inserted";

    }

    public Cursor readalldata() {
        SQLiteDatabase db = this.getWritableDatabase();
        String qry = "select * from tbl_recipe order by id desc";
        Cursor cursor = db.rawQuery(qry, null);
        return cursor;
    }

}
