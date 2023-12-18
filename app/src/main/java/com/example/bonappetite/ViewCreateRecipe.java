package com.example.bonappetite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;

public class ViewCreateRecipe extends AppCompatActivity
{

    RecyclerView recyclerView;
    ArrayList<Model> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_create_recipe);

        recyclerView=(RecyclerView)findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Cursor cursor=new DBmanager(this).readalldata();
        dataholder=new ArrayList<>();

        while(cursor.moveToNext())
        {
            Model obj=new Model(cursor.getString(1),cursor.getString(2));
            dataholder.add(obj);
        }

        MyAdapter adapter=new MyAdapter(dataholder);
        recyclerView.setAdapter(adapter);

    }
}