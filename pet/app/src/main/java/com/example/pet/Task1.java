package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Task1 extends AppCompatActivity {


    TextInputEditText usernameEditText;
    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        usernameEditText = findViewById(R.id.u1);
        searchButton = findViewById(R.id.button15);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString().trim();
                openUserProfile(username);
            }
        });
    }

    private void openUserProfile(String username) {

        Intent intent = null;

        if (username.equals("Jane11_@petcom")) {
            intent = new Intent(Task1.this, userprofile1.class);

        } else if (username.equals("Matt231_@petcom")) {
            intent = new Intent(Task1.this, userprofile2.class);

        } else if (username.equals("Joshua12_@petcom")) {
            intent = new Intent(Task1.this, userprofile3.class);
        }
        if (intent != null) {
            startActivity(intent);
        }
        else {

            Toast.makeText(Task1.this, "Wrong username. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }
}

