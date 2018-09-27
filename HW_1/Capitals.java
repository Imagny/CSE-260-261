import java.util.*;
import java.io.*;

public class Capitals {

	public static void main(String[] args) {
		HashMap<String, String> capitals = new HashMap<>();
		capitals.put("Alabama", "Montgomery");
		capitals.put("Alaska", "Juneau");
		capitals.put("Arizona", "Phoenix");
		capitals.put("Arkansas", "Little Rock");
		capitals.put("California", "Sacramento");				        
		capitals.put("Colorado", "Denver");
		capitals.put("Connecticut", "Hartford");
		capitals.put("Delaware", "Dover");
		capitals.put("Florida", "Tallahassee");
		capitals.put("Georgia", "Atlanta");
		capitals.put("Hawaii", "Honolulu");
		capitals.put("Idaho", "Boise");
		capitals.put("Illinois", "Springfield");
		capitals.put("Indiana", "Indianapolis");
		capitals.put("Iowa", "Des Moines");
		capitals.put("Kansas", "Topeka");
	     	capitals.put("Kentucky", "Frankfort");
		capitals.put("Louisiana", "Baton Rouge");
		capitals.put("Maine", "Augusta");
		capitals.put("Maryland", "Annapolis");
		capitals.put("Massachusetts", "Boston");
		capitals.put("Michigan", "Lansing");
		capitals.put("Minnesota", "Saint Paul");
		capitals.put("Mississippi", "Jackson");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Montana", "Helena");
	  	capitals.put("Nebraska", "Lincoln");
		capitals.put("Nevada", "Carson City");
		capitals.put("New Hampshire", "Concord");					
		capitals.put("New Mexico", "Santa Fe");
		capitals.put("New York", "Albany");
		capitals.put("North Dakota", "Bismarck");
		capitals.put("Oklahoma", "Oklahoma City");
		capitals.put("Oregon", "Salem");
		capitals.put("Rhode Island", "Providence");
		capitals.put("South Carolina", "Columbia");
		capitals.put("South Dakota", "Pierre");
		capitals.put("Tennessee", "Nashville");
		capitals.put("Texas", "Austin");
		capitals.put("Utah", "Salt Lake City");
		capitals.put("Vermont", "Montpelier");
		capitals.put("Virginia", "Richmond");
		capitals.put("Washington", "Olympia");
		capitals.put("West Virginia", "Charleston");
		capitals.put("Wisconsin", "Madison");
		capitals.put("Wyoming", "Cheyenne");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (capitals.get(input) != null) {
			System.out.println(capitals.get(input));
		} else {
			System.out.println("No state");
		}
	}

}
