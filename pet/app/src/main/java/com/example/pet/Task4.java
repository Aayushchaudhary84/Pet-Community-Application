package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Task4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);
        Button firstsignbutton = (Button) findViewById(R.id.button2);
        Button secondsignbutton = (Button) findViewById(R.id.button3);
        Button thirdsignbutton = (Button) findViewById(R.id.button5);
        Button Home = (Button)findViewById(R.id.bb) ;
        firstsignbutton.setOnClickListener(this);
        secondsignbutton.setOnClickListener(this);
        thirdsignbutton.setOnClickListener(this);
        Intent intent;


    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        Intent intent;

        int id = v.getId();

        if (id == R.id.button2){
            intent = new Intent(Task4.this, Task4signup.class);
            startActivity(intent);
        } else if (id == R.id.button3) {
            intent = new Intent(Task4.this, Task4signup.class);
            startActivity(intent);
        }else if (id == R.id.button5) {
            intent = new Intent(Task4.this, Task4event2.class);
            startActivity(intent);
        }





    }public void onhoo5(View view){

     Intent   i = new Intent(Task4.this, MainActivity.class);
        startActivity(i);


    }
}