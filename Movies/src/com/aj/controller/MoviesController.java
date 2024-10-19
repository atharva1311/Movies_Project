package com.aj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.aj.dao.MoviesDao;
import com.aj.entity.MovieCast;
import com.aj.service.MoviesService;

public class MoviesController {

	private MoviesService ms = new MoviesService();

	
	     
	//add movie
	public void addMovieController(Scanner sc)
	{
		ms.addMovieService(sc);
	}
	//remove movie
	public void removeMovieController(Scanner sc)
	{
		ms.removeMovieService(sc);
	}
	
	
	//get cast of movie
	
	public List<String>getMovieCastController(Scanner sc)
	{
		    return ms.getMovieCastService(sc); 
	}
	
	
	//total movies of cast
	public List<String> totalmoviesofcastController(Scanner sc)
	{
//		List<String> l2 = ms.totalmoviesofcastService(sc);
//		return l2;
		return ms.totalmoviesofcastService(sc);
	}
	
	
	// allmovies of specific year
	public Set<String> getMoviesofyearController(Scanner sc)
	{

		return ms.getMoviesofyearService(sc);
	}
	
	
	//all movies from database
	public Set<String> allMoviesofAllYearsController()
	{
		return ms.allMoviesofAllYearsService();
		
	}
	
	
	//Information about cast
	public MovieCast infoAboutCastController(Scanner sc)
	{

		return ms.infoAboutCastService(sc);
	}

}
