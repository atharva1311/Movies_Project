package com.aj.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.aj.dao.MoviesDao;
import com.aj.entity.MovieCast;

public class MoviesService {
	
	private static MoviesDao md = new MoviesDao();

	
	
	// Movies of the year
	public Set<String> getMoviesofyearService(Scanner sc) {
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		sc.nextLine();
//		System.out.println(md.allMovies);
		return md.getAllMoviesDao().get(year).keySet();
	}

	public static Map<String, List<MovieCast>> getMoviesofyear(int year) {

		return md.getAllMoviesDao().get(year);
	}

	// Getting all movies

	public static Set<String> allMoviesofAllYearsService() {

		return md.allMoviesofallYears().keySet();
	}
 


	// Get movie cast
	public List<String> getMovieCastService(Scanner sc) {
		List<String> castofmovie = new ArrayList<String>();
		System.out.println("Enter the movie: ");
		String name = sc.nextLine();
 
		if (md.allMoviesofallYears().keySet().contains(name)) {
			for (MovieCast mc : md.allMoviesofallYears().get(name)) {
				castofmovie.add(mc.getName());
			}
			return castofmovie;
		} else {
			System.out.println("Movie not found...");
			return null;
		}

	}

	public static List<String> getMovieCast(String name) {
		List<String> castofmovie = new ArrayList<String>();
		for (MovieCast mc : md.allMoviesofallYears().get(name)) {
			castofmovie.add(mc.getName());
		}
		return castofmovie;

	}

//Total movies of actor
	public List<String> totalmoviesofcastService(Scanner sc) {

//		int count = 0;
		System.out.println("Enter name of the actor: ");
		String actor = sc.nextLine();
		List<String> movies = new ArrayList<String>();
		for (String movie : MoviesService.allMoviesofAllYearsService()) {
			for (String name : getMovieCast(movie)) {
				if (actor.equalsIgnoreCase(name)) {
					movies.add(movie);
				}
			}
		}
		return movies;
	}

//Information of actor
	public MovieCast infoAboutCastService(Scanner sc) {
		MovieCast ab = null;
		System.out.println("Enter actor name: ");
		String name = sc.nextLine();
		boolean flag = false;
		
		for (String movie : MoviesService.allMoviesofAllYearsService()) {

			for (MovieCast mc : md.allMoviesofallYears().get(movie)) {
				if (mc.getName().equalsIgnoreCase(name)) {
					ab = mc;
					flag = true;
					break;

				}
			}

		}
		if (flag == true) {
			return ab;
		} else {
			System.out.println("Sorry this actor's information is not available...!");
			return null;
		}

	}

	// Add movie in the database:
	public void addMovieService(Scanner sc) {
		md.addMovie(sc);
	}

	// Remove movie from database:
	public void removeMovieService(Scanner sc) {
		
		md.removeMovie(sc);
	}

} 