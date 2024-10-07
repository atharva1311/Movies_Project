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
	static Map<Integer, Map<String, List<MovieCast>>> allMoviesService = md.getAllMoviesDao();

	static Map<String, List<MovieCast>> allMoviesofAllYearswithcast = allMoviesofAllYearswithCast();
	static Set<Integer> yearofAllMovies = allMoviesService.keySet();

	// Movies of the year
	public Set<String> getMoviesofyearService(Scanner sc) {
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		sc.nextLine();
		Set<String> Moviesofyear = allMoviesService.get(year).keySet();
		return Moviesofyear;
	}

	public static Map<String, List<MovieCast>> getMoviesofyear(int year) {

		Map<String, List<MovieCast>> Moviesofyear = allMoviesService.get(year);
		return Moviesofyear;
	}

	// Getting all movies

	public Set<String> allMoviesofAllYearsService() {

		Map<String, List<MovieCast>> allMoviesofallyears = new TreeMap<String, List<MovieCast>>();

		for (int year : yearofAllMovies) {
			allMoviesofallyears.putAll(getMoviesofyear(year));
		}
		Set<String> allMoviesOfAllYears = allMoviesofallyears.keySet();
		return allMoviesOfAllYears;
	}

	public static Map<String, List<MovieCast>> allMoviesofAllYearswithCast() {
		Set<Integer> yearofAllMovies = allMoviesService.keySet();
		Map<String, List<MovieCast>> allMoviesofallyears = new TreeMap<String, List<MovieCast>>();

		for (int year : yearofAllMovies) {
			allMoviesofallyears.putAll(getMoviesofyear(year));
		}
		return allMoviesofallyears;
	}

	// Get movie cast
	public List<String> getMovieCastService(Scanner sc) {
		List<String> castofmovie = new ArrayList<String>();
		System.out.println("Enter the movie: ");
		String name = sc.nextLine();
		Set<String> setofallmovies = allMoviesofAllYearswithCast().keySet();
		if (setofallmovies.contains(name)) {
			for (MovieCast mc : allMoviesofAllYearswithCast().get(name)) {
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
		for (MovieCast mc : allMoviesofAllYearswithCast().get(name)) {
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
		for (String movie : allMoviesofAllYearsService()) {
			for (String name : getMovieCast(movie)) {
				if (actor.equals(name)) {
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
		for (String movie : allMoviesofAllYearsService()) {

			for (MovieCast mc : allMoviesofAllYearswithCast().get(movie)) {
				if (mc.getName().equals(name)) {
					ab = mc;
					flag = true;
					break;

				}
			}

		}
		if (flag == true) {
			return ab;
		} else {
			System.out.println("Sorry this actor's information is not available");
			return null;
		}

	}

	// Add movie in the database:
	public void addMovieService(Scanner sc) {
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		sc.nextLine();
		if (yearofAllMovies.contains(year)) {
			System.out.print("Enter the movie name: ");
			String movie = sc.nextLine();
			if (allMoviesofAllYearsService().contains(movie)) {
				System.out.println("Movie is already exist..");
			} else {
				List<MovieCast> castList = new ArrayList<MovieCast>();
				System.out.println("Enter number of actors in the movie: ");
				int actorCount = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < actorCount; i++) {
					System.out.println("Enter actor name: ");
					String name = sc.nextLine();
					System.out.print("Enter actor age: ");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter actor gender: ");
					String gender = sc.nextLine();
					castList.add(new MovieCast(name, gender, age));
				}
//		Map <String,List<MovieCast>> addedmovie =new TreeMap<String,List<MovieCast>>();
//		addedmovie.put(movie, castList);
				allMoviesofAllYearswithcast.put(movie, castList);
				allMoviesService.put(year, allMoviesofAllYearswithcast);
			}

		} else {
			Map<String, List<MovieCast>> Moviesnew = new TreeMap<String, List<MovieCast>>();
			System.out.print("Enter the movie name: ");
			String movie = sc.nextLine();
			List<MovieCast> castList = new ArrayList<MovieCast>();
			System.out.println("Enter number of actors in the movie: ");
			int actorCount = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < actorCount; i++) {
				System.out.println("Enter actor name: ");
				String name = sc.nextLine();
				System.out.print("Enter actor age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter actor gender: ");
				String gender = sc.nextLine();
				castList.add(new MovieCast(name, gender, age));
			}
			Moviesnew.put(movie, castList);
			allMoviesService.put(year, Moviesnew);

		}
		System.out.println("Movie added successfully...!");
	}

	// Remove movie from database:
	public void removeMovieService(Scanner sc) {
		System.out.println("Enter the movie name: ");
		String name = sc.nextLine();

		if (allMoviesofAllYearsService().contains(name))

		{
			allMoviesofAllYearswithcast.remove(name);
			for (Map.Entry<Integer, Map<String, List<MovieCast>>> allMoviesServiceEntry : allMoviesService.entrySet()) {
				Map<String, List<MovieCast>> innermap = allMoviesServiceEntry.getValue();
				allMoviesService.remove(name);

			}
			System.out.println("Movie removed succcessfully...!");

		} else {
			System.out.println("Movie not found...!");
		}

	}

}
