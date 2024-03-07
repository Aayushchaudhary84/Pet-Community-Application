package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userprofile1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile1);
        Button addFriendButton = findViewById(R.id.addfriend);

        addFriendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open a new activity when the "Add to friends" button is clicked
                Intent intent = new Intent(userprofile1.this, addedfriend.class);
                startActivity(intent);
            }
        });
    }
}