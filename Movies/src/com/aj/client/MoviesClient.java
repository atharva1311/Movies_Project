package com.aj.client;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.aj.controller.MoviesController;
import com.aj.entity.MovieCast;

public class MoviesClient {
  public static void main(String[] args) {
	  MoviesController mc = new MoviesController();
	  Scanner sc = new Scanner(System.in);
	  int choice;
	do {
		System.out.println("   ** Welcome to Our Website **   ");
		System.out.println();
		System.out.println("***** Movie Management Menu *****");
		System.out.println();
		System.out.println("1. Add movie.");
		System.out.println("2. Remove movie.");
		System.out.println("3. Get cast for movie.");
		System.out.println("4. View information of actor.");
		System.out.println("5. View all movies of specific actor.");
		System.out.println("6. View all movies for a specific year.");
		System.out.println("7. View all movies in the database.");
		System.out.println("8. Exit");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt()	;
		sc.nextLine();
		switch(choice)
		{
		case 1:
			mc.addMovieController(sc);
			System.out.println();
			break;
		case 2:
			mc.removeMovieController(sc);
			System.out.println();
			break;
		case 3:
			List<String> l1 = mc.getMovieCastController(sc);
		    if (l1 != null && !l1.isEmpty()) {
		        System.out.println("----------------------------");
		        System.out.printf("| %-25s |\n", "Name of Actors");
		        System.out.println("----------------------------");
		        for (String name : l1) {
		            System.out.printf("| %-25s |\n", name);
		        }
		        System.out.println("----------------------------");
		    } else {
		        System.out.println("No cast found for this movie.");
		    }
		    break;
		case 4:
			MovieCast ab = mc.infoAboutCastController(sc);
		    if (ab != null) {
		        System.out.println("-----------------------------------------------");
		        System.out.printf("| %-25s | %-4s | %-8s |\n", "Name", "Age", "Gender");
		        System.out.println("-----------------------------------------------");
		        System.out.printf("| %-25s | %-4d | %-8s |\n", ab.getName(), ab.getAge(), ab.getGender());
		        System.out.println("-----------------------------------------------");
		    } else {
		        System.out.println("Actor not found.");
		    }
		    break;
		case 5:
			List<String> l2=mc.totalmoviesofcastController(sc);
			System.out.println(l2);
			System.out.println();
			break;
		case 6:
			Set<String> s1=mc.getMoviesofyearController(sc);
//			System.out.println(s1);
			System.out.println(" --------------------------------");
	        System.out.printf("| %-30s |\n", "Name of Movies");
	        System.out.println(" --------------------------------");
	        for(String name:s1)
			{
				System.out.printf("| %-30s |\n", name);
			}
	        System.out.println(" ---------------------------------");
			System.out.println();
			break;
		case 7:
			Set<String> s2=mc.allMoviesofAllYearsController();
//			System.out.println(s2);
			System.out.println(" --------------------------------");
	        System.out.printf("| %-30s |\n", "Name of Movies");
	        System.out.println(" --------------------------------");
	        for(String name:s2)
			{
				System.out.printf("| %-30s |\n", name);
			}
	        System.out.println(" --------------------------------");
			System.out.println();
			break;
		case 8:
            System.out.println("Thank You for visiting our site..!");
            break;
//		case 8:
//			System.out.println("Thank You for visiting our site..!");
//			System.out.println();
//			return;
		default:
		System.out.println("Invalid choice. Try again..!");
			
		}
		
//		if (choice == 8) {
//		    System.out.println("Thank You for visiting our site..!");
//		    break;
//		}
		
	}
	while(choice != 8);
}
}
