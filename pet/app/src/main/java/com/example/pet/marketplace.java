package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class marketplace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace);
    }



    public void onpetsup(View v ){
        Intent intent = new Intent(marketplace.this, petsupplies.class);
        startActivity(intent);



    }

    public void ontech(View v){
        Intent intent = new Intent(marketplace.this, pettech.class);
        startActivity(intent);

    }

    public void onacc(View v){


        Intent intent = new Intent(marketplace.this, petacc.class);
        startActivity(intent);



    }

    public void onh(View v){
        Intent intent = new Intent(marketplace.this, Health.class);
        startActivity(intent);


    }

    public void onhome(View v) {
        Intent intent = new Intent(marketplace.this, MainActivity.class);
        startActivity(intent);

    }
}