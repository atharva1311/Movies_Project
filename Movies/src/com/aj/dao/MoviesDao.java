package com.aj.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.aj.entity.MovieCast;

public class MoviesDao {

	public Map<Integer, Map<String, List<MovieCast>>> getAllMoviesDao() {
		Map<Integer, Map<String, List<MovieCast>>> allMovies = new LinkedHashMap<Integer, Map<String, List<MovieCast>>>();

		// 2023
		Map<String, List<MovieCast>> Movies2023 = new TreeMap<String, List<MovieCast>>();

		List<MovieCast> JawanCast = new ArrayList<MovieCast>();
		JawanCast.add(new MovieCast("Shah Rukh Khan", "Male", 58));
		JawanCast.add(new MovieCast("Nayanthara", "Female", 39));
		JawanCast.add(new MovieCast("Vijay Sethupathi", "Male", 46));
		JawanCast.add(new MovieCast("Deepika Padukone", "Female", 38));
		JawanCast.add(new MovieCast("Sanya Malhotra", "Female", 32));
		JawanCast.add(new MovieCast("Sanjay Dutt", "Male", 65));

		Movies2023.put("Jawan", JawanCast);

		List<MovieCast> PathaanCast = new ArrayList<MovieCast>();
		PathaanCast.add(new MovieCast("Shah Rukh Khan", "Male", 58));
		PathaanCast.add(new MovieCast("Salman Khan", "Male", 39));
		PathaanCast.add(new MovieCast("John Abraham", "Male", 51));
		PathaanCast.add(new MovieCast("Deepika Padukone", "Female", 38));
		PathaanCast.add(new MovieCast("Dimple Kapadia", "Female", 66));
		PathaanCast.add(new MovieCast("Ashutosh Rana", "Male", 56));

		Movies2023.put("Pathan", PathaanCast);

		List<MovieCast> AnimalCast = new ArrayList<MovieCast>();
		AnimalCast.add(new MovieCast("Ranbir Kapoor", "Male", 41));
		AnimalCast.add(new MovieCast("Anil Kapoor", "Male", 67));
		AnimalCast.add(new MovieCast("Bobby Deol", "Male", 55));
		AnimalCast.add(new MovieCast("Rashmika Mandanna", "Female", 28));
		AnimalCast.add(new MovieCast("Tripti Dimri", "Female", 30));

		Movies2023.put("Animal", AnimalCast);

		List<MovieCast> Gadar2Cast = new ArrayList<MovieCast>();
		Gadar2Cast.add(new MovieCast("Sunny Deol", "Male", 67));
		Gadar2Cast.add(new MovieCast("Ameesha Patel", "Female", 48));
		Gadar2Cast.add(new MovieCast("Utkarsh Sharma", "Male", 29));
		Gadar2Cast.add(new MovieCast("Simrat Kaur", "Female", 30));
		Gadar2Cast.add(new MovieCast("Manish Wadhwa", "Male", 51));

		Movies2023.put("Gadar 2", Gadar2Cast);

		List<MovieCast> SalaarCast = new ArrayList<MovieCast>();
		SalaarCast.add(new MovieCast("Prabhas", "Male", 44));
		SalaarCast.add(new MovieCast("Shruti Haasan", "Female", 38));
		SalaarCast.add(new MovieCast("Prithviraj Sukumaran", "Male", 41));
		SalaarCast.add(new MovieCast("Jagapathi Babu", "Male", 51));
		SalaarCast.add(new MovieCast("Eshwari Rao", "Female", 56));

		Movies2023.put("Salaar", SalaarCast);

		List<MovieCast> LeoCast = new ArrayList<MovieCast>();
		LeoCast.add(new MovieCast("Vijay", "Male", 49));
		LeoCast.add(new MovieCast("Trisha Krishnan", "Female", 41));
		LeoCast.add(new MovieCast("Sanjay Dutt", "Male", 64));
		LeoCast.add(new MovieCast("Arjun Sarja", "Male", 59));
		LeoCast.add(new MovieCast("Gautham Vasudev Menon", "Male", 50));

		Movies2023.put("Leo", LeoCast);

		allMovies.put(2023, Movies2023);

		// 2022
		
		Map<String, List<MovieCast>> Movies2022 = new TreeMap<String, List<MovieCast>>();

		List<MovieCast> BrahmastraCast = new ArrayList<MovieCast>();
		BrahmastraCast.add(new MovieCast("Ranbir Kapoor", "Male", 41));
		BrahmastraCast.add(new MovieCast("Alia Bhatt", "Female", 30));
		BrahmastraCast.add(new MovieCast("Amitabh Bachchan", "Male", 81));
		BrahmastraCast.add(new MovieCast("Nagarjuna Akkineni", "Male", 64));
		BrahmastraCast.add(new MovieCast("Mouni Roy", "Female", 38));
		

		Movies2022.put("Brahmastra", BrahmastraCast);

		List<MovieCast>  TheKashmirFilesCast = new ArrayList<MovieCast>();
		TheKashmirFilesCast.add(new MovieCast("Anupam Kher", "Male", 69));
		TheKashmirFilesCast.add(new MovieCast("Mithun Chakraborty", "Male", 73));
		TheKashmirFilesCast.add(new MovieCast("Pallavi Joshi", "Female", 54));
		TheKashmirFilesCast.add(new MovieCast("Darshan Kumaar", "Male", 37));
		TheKashmirFilesCast.add(new MovieCast("Chinmay Mandlekar", "Male", 51));

		Movies2022.put("The Kashmir Files", TheKashmirFilesCast);

		List<MovieCast> BhoolBhulaiyaa2Cast = new ArrayList<MovieCast>();
		BhoolBhulaiyaa2Cast.add(new MovieCast("Kartik Aaryan", "Male", 33));
		BhoolBhulaiyaa2Cast.add(new MovieCast("Kiara Advani", "Female", 32	));
		BhoolBhulaiyaa2Cast.add(new MovieCast("Tabu", "Female", 52));
		BhoolBhulaiyaa2Cast.add(new MovieCast("Rajpal Yadav", "Male", 52));
		BhoolBhulaiyaa2Cast.add(new MovieCast("Sanjay Mishra", "Male", 60));

		Movies2022.put("Bhool Bhulaiyaa 2", BhoolBhulaiyaa2Cast);

		List<MovieCast> Drishyam2Cast  = new ArrayList<MovieCast>();
		Drishyam2Cast.add(new MovieCast("Ajay Devgn", "Male", 55));
        Drishyam2Cast.add(new MovieCast("Shriya Saran", "Female", 41));
        Drishyam2Cast.add(new MovieCast("Tabu", "Female", 52));
        Drishyam2Cast.add(new MovieCast("Akshaye Khanna", "Male", 48));
        Drishyam2Cast.add(new MovieCast("Ishita Dutta", "Female", 33));

		Movies2022.put("Drishyam 2", Drishyam2Cast);

		List<MovieCast> GangubaiKathiawadiCast = new ArrayList<MovieCast>();
		GangubaiKathiawadiCast.add(new MovieCast("Alia Bhatt", "Female", 30));
        GangubaiKathiawadiCast.add(new MovieCast("Ajay Devgn", "Male", 55));
        GangubaiKathiawadiCast.add(new MovieCast("Shantanu Maheshwari", "Male", 32));
        GangubaiKathiawadiCast.add(new MovieCast("Vijay Raaz", "Male", 60));
        GangubaiKathiawadiCast.add(new MovieCast("Indira Tiwari", "Female", 33));

		Movies2022.put("Gangubai Kathiawadi", GangubaiKathiawadiCast);

		allMovies.put(2022, Movies2022);
		
		//2021
		Map<String, List<MovieCast>> Movies2021 = new TreeMap<String, List<MovieCast>>();
		
		 List<MovieCast> SooryavanshiCast = new ArrayList<>();
	        SooryavanshiCast.add(new MovieCast("Akshay Kumar", "Male", 56));
	        SooryavanshiCast.add(new MovieCast("Katrina Kaif", "Female", 40));
	        SooryavanshiCast.add(new MovieCast("Ajay Devgn", "Male", 55));
	        SooryavanshiCast.add(new MovieCast("Ranveer Singh", "Male", 39));
	        SooryavanshiCast.add(new MovieCast("Jackie Shroff", "Male", 66));
	        
	        Movies2021.put("Sooryavanshi", SooryavanshiCast);
	        
	        List<MovieCast> ShershaahCast = new ArrayList<>();
	        ShershaahCast.add(new MovieCast("Sidharth Malhotra", "Male", 39));
	        ShershaahCast.add(new MovieCast("Kiara Advani", "Female", 32));
	        ShershaahCast.add(new MovieCast("Shiv Panditt", "Male", 39));
	        ShershaahCast.add(new MovieCast("Nikitin Dheer", "Male", 43));
	        ShershaahCast.add(new MovieCast("Sahil Vaid", "Male", 36));
	        
	        Movies2021.put("Shershaah", ShershaahCast);

	        List<MovieCast> ChandigarhKareAashiquiCast = new ArrayList<>();
	        ChandigarhKareAashiquiCast.add(new MovieCast("Ayushmann Khurrana", "Male", 39));
	        ChandigarhKareAashiquiCast.add(new MovieCast("Vaani Kapoor", "Female", 35));
	        ChandigarhKareAashiquiCast.add(new MovieCast("Yograj Singh", "Male", 66));
	        ChandigarhKareAashiquiCast.add(new MovieCast("Abhishek Bajaj", "Male", 31));
	        ChandigarhKareAashiquiCast.add(new MovieCast("Kanwaljit Singh", "Male", 72));

	        Movies2021.put("Chandigarh Kare Aashiqui", ChandigarhKareAashiquiCast);

	        List<MovieCast> BellBottomCast = new ArrayList<>();
	        BellBottomCast.add(new MovieCast("Akshay Kumar", "Male", 56));
	        BellBottomCast.add(new MovieCast("Vaani Kapoor", "Female", 35));
	        BellBottomCast.add(new MovieCast("Huma Qureshi", "Female", 37));
	        BellBottomCast.add(new MovieCast("Lara Dutta", "Female", 45));
	        BellBottomCast.add(new MovieCast("Adil Hussain", "Male", 60));

	        Movies2021.put("Bell Bottom", BellBottomCast);
	        
	        List<MovieCast> a83Cast = new ArrayList<>();
	        a83Cast.add(new MovieCast("Ranveer Singh", "Male", 39));
	        a83Cast.add(new MovieCast("Deepika Padukone", "Female", 38));
	        a83Cast.add(new MovieCast("Pankaj Tripathi", "Male", 47));
	        a83Cast.add(new MovieCast("Tahir Raj Bhasin", "Male", 36));
	        a83Cast.add(new MovieCast("Jeeva", "Male", 39));
    
	        Movies2021.put("83", a83Cast);
	        
	        allMovies.put(2021, Movies2021);
	        
	        //2020
	        
	        Map<String, List<MovieCast>> Movies2020 = new TreeMap<String, List<MovieCast>>();
	        
	        List<MovieCast> TanhajiCast = new ArrayList<>();
	        TanhajiCast.add(new MovieCast("Ajay Devgn", "Male", 55));
	        TanhajiCast.add(new MovieCast("Saif Ali Khan", "Male", 53));
	        TanhajiCast.add(new MovieCast("Kajol", "Female", 49));
	        TanhajiCast.add(new MovieCast("Sharad Kelkar", "Male", 46));
	        TanhajiCast.add(new MovieCast("Luke Kenny", "Male", 53));

	        Movies2020.put("Tanhaji", TanhajiCast);
	        
	        List<MovieCast> LaxmiiCast = new ArrayList<>();
	        LaxmiiCast.add(new MovieCast("Akshay Kumar", "Male", 56));
	        LaxmiiCast.add(new MovieCast("Kiara Advani", "Female", 32));
	        LaxmiiCast.add(new MovieCast("Sharad Kelkar", "Male", 46));
	        LaxmiiCast.add(new MovieCast("Ashwini Kalsekar", "Female", 53));
	        LaxmiiCast.add(new MovieCast("Ayesha Raza Mishra", "Female", 45));
	        
	        Movies2020.put("Laxmii", LaxmiiCast);

	        List<MovieCast> GunjanSaxenaCast = new ArrayList<>();
	        GunjanSaxenaCast.add(new MovieCast("Janhvi Kapoor", "Female", 26));
	        GunjanSaxenaCast.add(new MovieCast("Pankaj Tripathi", "Male", 47));
	        GunjanSaxenaCast.add(new MovieCast("Angad Bedi", "Male", 40));
	        GunjanSaxenaCast.add(new MovieCast("Manav Vij", "Male", 46));
	        GunjanSaxenaCast.add(new MovieCast("Ayesha Raza Mishra", "Female", 45));
	        
	        Movies2020.put("Gunjan Saxena: The Kargil Girl", GunjanSaxenaCast);

	        List<MovieCast> DilBecharaCast = new ArrayList<>();
	        DilBecharaCast.add(new MovieCast("Sushant Singh Rajput", "Male", 34));
	        DilBecharaCast.add(new MovieCast("Sanjana Sanghi", "Female", 27));
	        DilBecharaCast.add(new MovieCast("Sahil Vaid", "Male", 36));
	        DilBecharaCast.add(new MovieCast("Swastika Mukherjee", "Female", 43));
	        DilBecharaCast.add(new MovieCast("Saswata Chatterjee", "Male", 53));

	        Movies2020.put("Dil Bechara", DilBecharaCast);
	        
	        List<MovieCast> MalangCast = new ArrayList<>();
	        MalangCast.add(new MovieCast("Aditya Roy Kapur", "Male", 38));
	        MalangCast.add(new MovieCast("Disha Patani", "Female", 31));
	        MalangCast.add(new MovieCast("Anil Kapoor", "Male", 67));
	        MalangCast.add(new MovieCast("Kunal Khemu", "Male", 40));
	        MalangCast.add(new MovieCast("Elli AvrRam", "Female", 33));

	        Movies2020.put("Malang", MalangCast);
	        
	        allMovies.put(2020, Movies2020);
	        
	        //2019
	        
	        Map<String, List<MovieCast>> Movies2019 = new TreeMap<String, List<MovieCast>>();
	        
	        List<MovieCast> WarCast = new ArrayList<>();
	        WarCast.add(new MovieCast("Hrithik Roshan", "Male", 49));
	        WarCast.add(new MovieCast("Tiger Shroff", "Male", 33));
	        WarCast.add(new MovieCast("Vaani Kapoor", "Female", 35));
	        WarCast.add(new MovieCast("Ashutosh Rana", "Male", 55));
	        WarCast.add(new MovieCast("Anupriya Goenka", "Female", 36));
	        
	        Movies2019.put("War", WarCast);

	        List<MovieCast> KabirSinghCast = new ArrayList<>();
	        KabirSinghCast.add(new MovieCast("Shahid Kapoor", "Male", 42));
	        KabirSinghCast.add(new MovieCast("Kiara Advani", "Female", 32));
	        KabirSinghCast.add(new MovieCast("Soham Majumdar", "Male", 31));
	        KabirSinghCast.add(new MovieCast("Arjan Bajwa", "Male", 44));
	        KabirSinghCast.add(new MovieCast("Nikita Dutta", "Female", 32));
	        
	        Movies2019.put("Kabir Singh", KabirSinghCast);

	        List<MovieCast> GullyBoyCast = new ArrayList<>();
	        GullyBoyCast.add(new MovieCast("Ranveer Singh", "Male", 39));
	        GullyBoyCast.add(new MovieCast("Alia Bhatt", "Female", 31));
	        GullyBoyCast.add(new MovieCast("Siddhant Chaturvedi", "Male", 30));
	        GullyBoyCast.add(new MovieCast("Kalki Koechlin", "Female", 39));
	        GullyBoyCast.add(new MovieCast("Vijay Raaz", "Male", 60));
	        
	        Movies2019.put("Gully Boy", GullyBoyCast);

	        List<MovieCast> ChhichhoreCast = new ArrayList<>();
	        ChhichhoreCast.add(new MovieCast("Sushant Singh Rajput", "Male", 34));
	        ChhichhoreCast.add(new MovieCast("Shraddha Kapoor", "Female", 36));
	        ChhichhoreCast.add(new MovieCast("Varun Sharma", "Male", 33));
	        ChhichhoreCast.add(new MovieCast("Tahir Raj Bhasin", "Male", 36));
	        ChhichhoreCast.add(new MovieCast("Prateik Babbar", "Male", 37));
	        
	        Movies2019.put("Chhichhore", ChhichhoreCast);

	        List<MovieCast> Housefull4Cast = new ArrayList<>();
	        Housefull4Cast.add(new MovieCast("Akshay Kumar", "Male", 56));
	        Housefull4Cast.add(new MovieCast("Riteish Deshmukh", "Male", 45));
	        Housefull4Cast.add(new MovieCast("Kriti Sanon", "Female", 33));
	        Housefull4Cast.add(new MovieCast("Pooja Hegde", "Female", 33));
	        Housefull4Cast.add(new MovieCast("Bobby Deol", "Male", 55));
	        
	        Movies2019.put("Housefull 4", Housefull4Cast);
	        
	        allMovies.put(2019, Movies2019);
	        
		return allMovies;

	}
}
