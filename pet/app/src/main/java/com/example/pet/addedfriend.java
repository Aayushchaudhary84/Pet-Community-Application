package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class addedfriend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addedfriend);
    }

    public void onhomeadd(View v ) {
        Intent intent = new Intent(addedfriend.this, MainActivity.class);
        startActivity(intent);
    }


}