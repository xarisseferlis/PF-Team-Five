package com.team.five.pfmovieapp.viewmodels;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.team.five.pfmovieapp.models.MovieModel;
import com.team.five.pfmovieapp.repositories.MovieRepository;

import java.util.List;

public class MovieListViewModel extends ViewModel {

    // this class is used for VIEWMODEL


    private MovieRepository movieRepository;


    // Constructor
    public MovieListViewModel() {
        movieRepository = MovieRepository.getInstance();

    }

    public LiveData<List<MovieModel>> getMovies(){
        return movieRepository.getMovies();
    }

    public LiveData<List<MovieModel>> getPop(){
        return movieRepository.getPop();
    }



    // 3- Calling method in view-model
    public void searchMovieApi(String query, int pageNumber){
        movieRepository.searchMovieApi(query, pageNumber);
    }

    // 3- Calling method in view-model
    public void searchMoviePop(int pageNumber){
        movieRepository.searchMoviePop( pageNumber);
    }



    public void searchNextpage(){
        movieRepository.searchNextPage();
    }


}
