package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onevents(View v ){

        Intent intent = new Intent(MainActivity.this, Task4.class);
            startActivity(intent);



    }
    public void onmarket(View v ){
        Intent intent = new Intent(MainActivity.this, marketplace.class);
        startActivity(intent);





    }
    public void onservice(View v ) {
        Intent intent = new Intent(MainActivity.this, task3.class);
        startActivity(intent);
    }


    public void ondiscover(View v ) {
        Intent intent = new Intent(MainActivity.this, Task1.class);
        startActivity(intent);


    }
    public void onpost(View v ) {
        Intent intent = new Intent(MainActivity.this, task5_make_Posts.class);
        startActivity(intent);


    }

}

