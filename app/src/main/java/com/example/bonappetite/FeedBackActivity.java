package com.example.bonappetite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FeedBackActivity extends AppCompatActivity {
    private EditText feedbackEditText;
    private Button submitFeedbackButton;
    private DatabaseReference feedbackRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        feedbackEditText = findViewById(R.id.feedbackEditText);
        submitFeedbackButton = findViewById(R.id.submitFeedbackButton);

        // Initialize Firebase Database Reference
        feedbackRef = FirebaseDatabase.getInstance().getReference("feedback");

        submitFeedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String feedback = feedbackEditText.getText().toString().trim();
                if (!feedback.isEmpty()) {
                    // Push the feedback to Firebase Database
                    String key = feedbackRef.push().getKey();
                    feedbackRef.child(key).setValue(feedback);
                    Toast.makeText(FeedBackActivity.this, "Feedback submitted!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FeedBackActivity.this, "Please enter feedback", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
