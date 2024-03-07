package com.example.pet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class post_display extends AppCompatActivity {
    private Button previousButton, nextButton, homepageButton;
    int counter = 0, postNumber = 0;

    private ArrayList<String> captionARL = new ArrayList<String>(), descriptionARL = new ArrayList<String>(), userNameARL = new ArrayList<String>(), visibilityARL = new ArrayList<String>();
    // ArrayList<task5_makePosts.Post> postsArrayList = (ArrayList<task5_makePosts.Post>) getIntent().getSerializableExtra("postsArrayList");
    int index = 1;
    private TextView captionTextView, descriptionTextView, visibilityTextView, userTextView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_display);

        previousButton = findViewById(R.id.previousButton);
        nextButton = findViewById(R.id.nextButton);
        homepageButton = findViewById(R.id.homePageButton);
        captionTextView = findViewById(R.id.captionTextView);
        descriptionTextView = findViewById(R.id.captionTextView);
        visibilityTextView = findViewById(R.id.visibilityTextView);
        userTextView = findViewById(R.id.userEditText);

        String filename = "post-storage.txt", line = "";

        try {
            FileInputStream fis = openFileInput(filename);  //A FileInputStream obtains input bytes from a file in a file system
            InputStreamReader isr = new InputStreamReader(fis); //An InputStreamReader is a bridge from byte streams to character streams
            BufferedReader br = new BufferedReader(isr);    //Reads text from a character-input stream,

            line = br.readLine();
            if(line != null) {
                String[] info = line.split(",");
                // captionTextView.setText(info[0]);
                // descriptionTextView.setText(info[1]);
                // visibilityTextView.setText(info[2]);
                // userTextView.setText(info[3]);
                captionARL.add(info[0]);
                descriptionARL.add(info[1]);
                visibilityARL.add(info[2]);
                userNameARL.add(info[3]);
                counter++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        display();

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postNumber--;
                if(postNumber >= 0) {
                    display();
                } else {
                    postNumber = counter-1;
                    display();
                }
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postNumber++;
                if(postNumber < counter) {
                    display();
                } else {
                    postNumber = 0; display();
                }
            }
        });
        homepageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void display(){
        if (counter == -1) {
            Toast.makeText(this, "Please make a post!", Toast.LENGTH_LONG).show();

            captionTextView.setText("Caption");
            descriptionTextView.setText("Description");
            visibilityTextView.setText("Visibility");
            userTextView.setText("User");
        } else {
            captionTextView.setText(captionARL.get(postNumber));
            descriptionTextView.setText(descriptionARL.get(postNumber));
            visibilityTextView.setText(visibilityARL.get(postNumber));
            userTextView.setText(userNameARL.get(postNumber));
        }
    }
}
