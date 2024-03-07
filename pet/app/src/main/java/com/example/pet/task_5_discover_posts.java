package com.example.pet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

class task5_discoverPosts extends AppCompatActivity {
    private Button previousButton, nextButton, homepageButton, viewPostsButton;
    int currentIndex = 1;
    private TextView captionTextView, descriptionTextView, visibilityTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5_discover_posts);

        // ArrayList<task5_makePosts.Post> postsArrayList = (ArrayList<task5_makePosts.Post>) getIntent().getSerializableExtra("postsArrayList");

        previousButton = findViewById(R.id.previousButton);
        nextButton = findViewById(R.id.nextButton);
        homepageButton = findViewById(R.id.homePageButton);
        captionTextView = findViewById(R.id.captionTextView);
        descriptionTextView = findViewById(R.id.captionTextView);
        visibilityTextView = findViewById(R.id.visibilityTextView);

        viewPostsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });



        /*
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!postsArrayList.isEmpty()){
                    if(currentIndex < postsArrayList.size() - 1){
                        task5_makePosts.Post post = postsArrayList.get(currentIndex + 1);
                        captionTextView.setText(post.getCaption());
                        descriptionTextView.setText((post.getDescription()));
                        visibilityTextView.setText(post.getVisisbility());
                    }
                }
            }
        });
       previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!postsArrayList.isEmpty()){
                    if(currentIndex >= 1){
                        task5_makePosts.Post post = postsArrayList.get(currentIndex + 1);
                        captionTextView.setText(post.getCaption());
                        descriptionTextView.setText((post.getDescription()));
                        visibilityTextView.setText(post.getVisisbility());
                    }
                }
            }
        });
        homepageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        */
    }


}
