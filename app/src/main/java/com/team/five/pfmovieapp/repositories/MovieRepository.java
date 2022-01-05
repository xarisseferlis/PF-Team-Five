package com.team.five.pfmovieapp.repositories;

import androidx.lifecycle.LiveData;

import com.team.five.pfmovieapp.models.MovieModel;
import com.team.five.pfmovieapp.request.MovieApiClient;

import java.util.List;

public class MovieRepository {
    // This class is acting as repositories

    private static MovieRepository instance;

    private MovieApiClient movieApiClient;

    private String mQuery;
    private int mPageNumber;


    public static MovieRepository getInstance() {
        if (instance == null) {
            instance = new MovieRepository();
        }
        return instance;

    }

    private MovieRepository(){

        movieApiClient = MovieApiClient.getInstance();
    }




    public LiveData<List<MovieModel>> getMovies(){
        return movieApiClient.getMovies();
    }

    // 2- Calling the method in repository
    public void searchMovieApi(String query, int pageNumber){
        mQuery = query;
        mPageNumber = pageNumber;
        movieApiClient.searchMoviesApi(query, pageNumber);
    }


    public void searchNextPage(){
        searchMovieApi(mQuery, mPageNumber+1);
    }





    public LiveData<List<MovieModel>> getPop(){
        return movieApiClient.getPop();
    }

    // 2- Calling the method in repository
    public void searchMoviePop(int pageNumber){

        mPageNumber = pageNumber;
        movieApiClient.searchMoviesPop( pageNumber);
    }

}




