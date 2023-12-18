package com.example.bonappetite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomePageActivity extends AppCompatActivity {
    FirebaseAuth log = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageView iv, fb, fv, cr, vr, lg;
        iv = findViewById(R.id.view);
        fb = findViewById(R.id.feedback);
        fv = findViewById(R.id.favorite);
        cr = findViewById(R.id.create);
        vr = findViewById(R.id.viewur);
        lg = findViewById(R.id.logout);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, HomeActivity.class));
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, FeedBackActivity.class));
            }
        });

        fv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, ViewFav.class));
            }
        });

        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, CreateRecipe.class));
            }
        });

        vr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, ViewCreateRecipe.class));
            }
        });

        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log.signOut();
                clearLoggedInStatus();
                Toast.makeText(HomePageActivity.this, "Logged out.", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomePageActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    private void clearLoggedInStatus() {
        SharedPreferences sharedPreferences = getSharedPreferences(Login.SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(Login.KEY_IS_LOGGED_IN, false);
        editor.apply();
    }
}
