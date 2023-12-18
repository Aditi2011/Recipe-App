package com.example.bonappetite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class CreateRecipe extends AppCompatActivity {
    TextInputLayout recname, recdetails;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_recipe);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recname = (TextInputLayout) findViewById(R.id.recipetext);
        recdetails = (TextInputLayout) findViewById(R.id.detailstext);
        save = (Button) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = recname.getEditText().getText().toString();
                String details = recdetails.getEditText().getText().toString();

                if (name.isEmpty() || details.isEmpty()) {
                    // Show a toast message when fields are empty
                    Toast.makeText(getApplicationContext(), "Please enter both name and details.", Toast.LENGTH_SHORT).show();
                } else {
                    // Save the recipe and start the new activity
                    processinsert(name, details);
                    startActivity(new Intent(getApplicationContext(), ViewCreateRecipe.class));
                }
            }
        });
    }

    private void processinsert(String n, String c) {
        String res = new DBmanager(this).addrecord(n, c);
        recname.getEditText().setText("");
        recdetails.getEditText().setText("");
        Toast.makeText(getApplicationContext(), res, Toast.LENGTH_SHORT).show();
    }
}
