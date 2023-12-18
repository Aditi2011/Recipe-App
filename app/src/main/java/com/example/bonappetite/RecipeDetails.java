package com.example.bonappetite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetails extends AppCompatActivity {
    TextView tv1;
    EditText edDetails;
    ImageView img;
    Button fav;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);
        tv1 = findViewById(R.id.BookName);
        edDetails = findViewById(R.id.edBookDetails);
        edDetails.setKeyListener(null);
        img = findViewById(R.id.imageView);
        fav = findViewById(R.id.favorecipe);
        Bundle bundle = getIntent().getExtras();
        int resId = bundle.getInt("text4");
        img.setImageResource(resId);
//        read = findViewById(R.id.btnRead);

        Intent intent = getIntent();
        tv1.setText(intent.getStringExtra("text1"));
        edDetails.setText(intent.getStringExtra("text2"));
        String url = intent.getStringExtra("text3");
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("favrec", Context.MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();

//                String recname = sharedPreferences.getString("recname", "").toString();
                String recname = tv1.getText().toString();
                String recmahiti = edDetails.getText().toString();
                if (recname != "" || recmahiti !="" ){
                    myEdit.putString("recname",recname);
                    myEdit.putString("recdetails",recmahiti);

                    myEdit.commit();
                    Toast.makeText(RecipeDetails.this, "Recipe added to favourite ❤", Toast.LENGTH_SHORT).show();

                }
//                DBmanager sqLiteDatabase = new DBmanager(getApplicationContext(), "book",null,1);
//                if (sqLiteDatabase.checkFav(recname,recdetails) == 1){
//                    Toast.makeText(RecipeDetails.this, "Recipe Already Exists...", Toast.LENGTH_SHORT).show();
//                }
//
//                else{
//                    sqLiteDatabase.addFav(recname,recdetails);
//                    Toast.makeText(RecipeDetails.this, "Recipe added to favourite ❤", Toast.LENGTH_SHORT).show();
//                    //startActivity(new Intent(BookDetailsActivity.this, LabTestActivity.class));
//                }
            }
        });
    }
}