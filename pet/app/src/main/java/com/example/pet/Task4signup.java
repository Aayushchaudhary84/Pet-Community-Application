package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Task4signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4signup);
        Spinner spinner =  findViewById(R.id.spinnerQuestion);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(Task4signup.this,"Selected Item" +  item, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Task4signup.this,"Please select an item", Toast.LENGTH_SHORT).show();
            }
        });
        ArrayList<String> options = new ArrayList<>();
        options.add("Reptilian Fashion Show");
        options.add("Woofer's Party");
        options.add("Retriever Race");
        options.add("Parakeet Fiesta");
        ArrayAdapter<String> adapter = new ArrayAdapter<> (Task4signup.this, android.R.layout.simple_spinner_item,options);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner.setAdapter(adapter);
    }
    public void onr(View v){
        Intent intent = new Intent(Task4signup.this, RegisteredT4.class);
        startActivity(intent);
    }
}