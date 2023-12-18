package com.example.bonappetite;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewFav extends AppCompatActivity {
    ListView favListView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_fav);

        favListView = findViewById(R.id.favListView);

        // Load and display favorite recipes
        loadAndDisplayFavoriteRecipes();
    }

    private void loadAndDisplayFavoriteRecipes() {
        // Retrieve favorite recipes from shared preferences
        SharedPreferences sh = getSharedPreferences("favrec", Context.MODE_PRIVATE);

        String recname = sh.getString("recname", "");
        String recdetails = sh.getString("recdetails", "");

        ArrayList<String> favRecipes = new ArrayList<>();

        if (!recname.isEmpty() && !recdetails.isEmpty()) {
            favRecipes.add("Recipe Name: " + recname);
            favRecipes.add("Recipe Details: " + recdetails);
        }

        // Set up the ListView to display the favorite recipes
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, favRecipes);
        favListView.setAdapter(adapter);
    }
}
