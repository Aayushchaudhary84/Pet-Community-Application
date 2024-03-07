package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sumitted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumitted);
    }

    public void onh2(View v){
        Intent intent = new Intent(sumitted.this, MainActivity.class);
        startActivity(intent);
    }
    }

