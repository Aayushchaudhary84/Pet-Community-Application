package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class petsupplies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petsupplies);





    }

    public void onback(View v ){
        Intent intent = new Intent(petsupplies.this, marketplace.class);
        startActivity(intent);



    }
}