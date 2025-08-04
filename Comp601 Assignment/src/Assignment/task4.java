package Assignment;
import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class task4 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 // prompt to enter a line of colors
		 System.out.print("Enter first line of colours: ");
         String[] firstColours = input.nextLine().split(",");

         // Another prompts to enter a line of colors
         System.out.print("Enter second line of colours: ");
         String[] secondColours = input.nextLine().split(",");
         
         // creates a list to store duplicate color names
         List <String> dupecolour = new ArrayList<>();
         
         // checks for any duplicate colors
         for(String colour1 : firstColours) {
        	 for(String colour2 : secondColours) {
        		 if(colour1.trim().equalsIgnoreCase(colour2.trim())) {
        			 if (!dupecolour.contains(colour1.trim())) {
                         dupecolour.add(colour1.trim());
        		 }
        			 
        	 }
         }
	}
         // shows the number of colors entered in each list and shows the number of overlapping or duplicate colors
         out.println("You entered " + firstColours.length + " colours in first list");
         out.println("You entered " + secondColours.length + " colours in second list");
         out.println("Number of overlapping colours: " + dupecolour.size());

         // shows duplicate colors
         if (!dupecolour.isEmpty()) {
        	 System.out.println("Overlapping colours are as follows:");
             for (String colour : dupecolour) {
            	 System.out.println(colour);
 
             }
         }
         input.close();        
		}
             
}
