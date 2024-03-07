package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisteredT4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered_t4);
    }

    public void onho4(View v){
        Intent intent = new Intent(RegisteredT4.this, MainActivity.class);
        startActivity(intent);

    }
}