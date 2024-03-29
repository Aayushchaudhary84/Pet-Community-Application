package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class task3 extends AppCompatActivity {

    private Spinner serviceSpinner;
    private String[] services = { "Select your service:","Pet Trainers", "Veterinarians", "Pet Groomers"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        serviceSpinner = findViewById(R.id.spinner1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, services);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        serviceSpinner.setAdapter(adapter);

        serviceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0) {
                    switch (position) {
                        case 1:
                            startActivity(new Intent(task3.this, pettrainers.class));
                            break;
                        case 2:
                            startActivity(new Intent(task3.this, Veterarians.class));
                            break;
                        case 3:
                            startActivity(new Intent(task3.this, PetGroomers.class));
                            break;
                    }
                    serviceSpinner.setSelection(0);
                } else {
                    // Show a toast message if the user doesn't select anything
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle no selection if needed
                Toast.makeText(task3.this, "Please select a service", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void onhome (View v){
        Intent intent = new Intent(task3.this, MainActivity.class);
        startActivity(intent);

    }
}