package Task9;
import java.lang.System.*;
import java.nio.file.Files;
import java.io.*;
import java.util.*;
//GameApp class
public class GameApp {
	//creates a list of countries using the gamedata.txt file
	 private List<Country> countryList;
	 public GameApp(String gamedata) throws IOException {
	 countryList = new LinkedList<>();
	 readData(gamedata);
	 }
	 // reads the data in the txt file and splits the data into different categories (name, capital and population 
	 public void readData(String gamedata) throws IOException {
		 BufferedReader reader = new BufferedReader(new FileReader(gamedata));
		 String line;
		 while((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            String name = parts[0].trim();
	            String capital = parts[1].trim();
	            int population = Integer.parseInt(parts[2].trim());
	            countryList.add(new Country(name, capital, population));
	        }
	        reader.close();
	    }
	 // Method that randomly generates a country from the list and asks a question
	public void game() {
	    Scanner scanner = new Scanner(System.in);
	    Random rand = new Random();
	    boolean playAgain = true;

	    while (playAgain) {
	        int index = rand.nextInt(countryList.size());
	        Country country = countryList.get(index);

	        int attempts = 3;
	        boolean correct = false;

	        // asks the player for the capital of a country
	        while (attempts > 0) {
	            System.out.printf("What’s the capital of %s? ", country.getName());
	            String answer = scanner.nextLine().trim();

	            // result if correct
	            if (answer.equalsIgnoreCase(country.getCapital())) {
	                System.out.println("Well done!");
	                correct = true;
	                break;
	            // result if incorrect
	            } else {
	                attempts--;
	                if (attempts > 0) {
	                    System.out.println("Try again.");
	                }
	            }
	        }

	        //result if the player runs out of attempts
	        if (!correct) {
	            System.out.printf("Incorrect. It’s %s.\n", country.getCapital());
	        }
	        System.out.printf("%s is a country of %d million.\n", country.getName(), country.getPopulation());
	        System.out.print("Play again (y/n)? ");
	        String response = scanner.nextLine().trim().toLowerCase();
	        playAgain = response.equals("y");
	    }
	}
}
// end of GameApp class
