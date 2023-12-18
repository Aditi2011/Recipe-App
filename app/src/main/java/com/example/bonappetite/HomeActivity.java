package com.example.bonappetite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
ImageView ve,nv,ind,des,ita,chi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ve=findViewById(R.id.veg);
        nv=findViewById(R.id.nonveg);
        ind=findViewById(R.id.indian);
        des=findViewById(R.id.deserts);
        ita=findViewById(R.id.italian);
        chi=findViewById(R.id.chinese);

        ve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HomeActivity.this,ViewRecipeActivity.class);
                it.putExtra("title","Veg");
                startActivity(it);

            }
        });
        nv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HomeActivity.this,ViewRecipeActivity.class);
                it.putExtra("title","NonVeg");
                startActivity(it);

            }
        });
        ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HomeActivity.this,ViewRecipeActivity.class);
                it.putExtra("title","Indian");
                startActivity(it);

            }
        });
        ita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HomeActivity.this,ViewRecipeActivity.class);
                it.putExtra("title","Italian");
                startActivity(it);

            }
        });
        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HomeActivity.this,ViewRecipeActivity.class);
                it.putExtra("title","Chinese");
                startActivity(it);

            }
        });
        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HomeActivity.this,ViewRecipeActivity.class);
                it.putExtra("title","Deserts");
                startActivity(it);

            }
        });
    }
}