package com.team.five.pfmovieapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.team.five.pfmovieapp.models.MovieModel;

public class MovieDetails extends AppCompatActivity {

    // Widgets
    private ImageView imageViewDetails;
    private TextView titleDetails, descDetails;
    private RatingBar ratingBarDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);


        imageViewDetails = findViewById(R.id.imageView_details);
        titleDetails = findViewById(R.id.textView_title_details);
        descDetails = findViewById(R.id.textView_desc_details);
        ratingBarDetails = findViewById(R.id.ratingBar_details);


        GetDataFromIntent();

    }

    private void GetDataFromIntent() {
        if (getIntent().hasExtra("movie")){
            MovieModel movieModel = getIntent().getParcelableExtra("movie");

            titleDetails.setText(movieModel.getTitle());
            descDetails.setText(movieModel.getMovie_overview());
            ratingBarDetails.setRating((movieModel.getVote_average())/2);

            Log.v("Tagy" ,"X"+ movieModel.getMovie_overview());


            Glide.with(this)
                    .load("https://image.tmdb.org/t/p/w500/"
                    +movieModel.getPoster_path())
                    .into(imageViewDetails);




        }
    }
}

// Now let's make our app looks more professional
// 1- editing the layout of details activity
// 2-  Creating shadow background with  gradient effect

// Let's check the movie model

// Amazing !!! We are professional developers !!!!



// We deserve 5 stars on our hard work!
// Be honest !@!! Rate us 5 stars on udemy
// Subscribe to our youtube channel: Master COding
// download our app: Master Coding on playstore!!
