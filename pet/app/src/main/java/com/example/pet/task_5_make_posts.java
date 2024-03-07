package com.example.pet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

 class task5_make_Posts extends AppCompatActivity {
    private Spinner postVisibilitySpinner;
    private EditText captionEditText, descriptionEditText, userNameEditText;
    private Button makePostButton, cancelButton, viewPostsButton; // future feature: viewPreviousPostsButton;
    String[] visibilitySpinnerOptions = {"Public", "Private", "Friends & Family"};
    String filename = "post-storage.txt";
    // ArrayList<Post> makePostSaveData = new ArrayList<Post>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5_make_posts);

        postVisibilitySpinner = findViewById(R.id.postVisibilitySpinner);
        captionEditText = findViewById(R.id.captionEditText);
        descriptionEditText = findViewById(R.id.descriptionEditText);
        makePostButton = findViewById(R.id.makePostButton);
        cancelButton = findViewById(R.id.saveButton);
        viewPostsButton = findViewById(R.id.viewPostsButton);
        userNameEditText = findViewById(R.id.userNameEditText);

        // future feature: viewPreviousPostsButton = findViewById(R.id.viewPreviousPostsButton);

        populateSpinnerOptions();

        viewPostsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(task5_make_Posts.this, post_display.class);
                // intent.putExtra("postsArrayList", makePostSaveData);
                // intent.putParcelableArrayListExtra("postsArrayList", (ArrayList<? extends Parcelable>) makePostSaveData);
                startActivity(intent);
            }
        });
        makePostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(captionEditText.getText().toString().isEmpty() || descriptionEditText.getText().toString().isEmpty() || postVisibilitySpinner.getSelectedItem().toString().isEmpty()){
                    Toast.makeText(task5_make_Posts.this, "Please complete all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // saveToArray(new Post(captionEditText.getText().toString(), descriptionEditText.getText().toString(), "Public"));// postVisibilitySpinner.toString()));
                    // Toast.makeText(task5_makePosts.this, "Post Submitted", Toast.LENGTH_SHORT).show();
                    saveToFile();
                    String line = "";
                    /*
                    try {
                        FileInputStream fis = openFileInput(filename);  //A FileInputStream obtains input bytes from a file in a file system
                        InputStreamReader isr = new InputStreamReader(fis); //An InputStreamReader is a bridge from byte streams to character streams
                        BufferedReader br = new BufferedReader(isr);    //Reads text from a character-input stream,
                        if(br.readLine() != null) {
                            Toast.makeText(task5_makePosts.this, "Post Submitted", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                    */
                }
            }
        });
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void populateSpinnerOptions() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, visibilitySpinnerOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        postVisibilitySpinner.setAdapter(adapter);
    }
    /*
    private void saveToArray(Post post) {
        makePostSaveData.add(post);
    }
    */
    private void saveToFile(){
        String fileContents = captionEditText.getText().toString() + "," + descriptionEditText.getText().toString() + "," + postVisibilitySpinner.getSelectedItem().toString() + "," + userNameEditText.toString() + "\n";
        FileOutputStream outputStream;
        try {
            outputStream = openFileOutput(filename, Context.MODE_APPEND);
            outputStream.write(fileContents.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    private void viewPreviousPosts(){
        // future feature
    }
    public class Post implements Serializable {
        private String caption, description, visibility;
        public Post(String caption, String description, String visibility) {
            this.caption = caption;
            this.description = description;
            this.visibility = visibility;
        }
        public String getCaption() { return caption; }
        public String getVisibility() { return visibility; }
        public String getDescription() { return description; }
    }
    */
}
