package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class petacc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petacc);


    }

    public void onback2(View v ){
        Intent intent = new Intent(petacc.this, marketplace.class);
        startActivity(intent);



    }



}