package Task6;
import java.lang.System.*;
import java.util.*;

// main class
public class Main {
	public static void main(String[] args){
		// Creates a list of values to be used
		List<LeafyGreen> veges = new LinkedList<>();
		veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
		veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
		veges.add(new LeafyGreen(20, 5.45, "Broccoli"));
		veges.add(new LeafyGreen(7, 1.94, "Lettuce"));
		veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
		veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
		veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
		veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
		veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
		veges.add(new LeafyGreen(26, 4.8, "Broccoli"));
		 calculateStats(veges);
		}
	
	// calculates the cost and weight of all the vegetables
	public static void calculateStats(List<LeafyGreen> veges) {
        double totalCost = 0;
        double totalCabbageWeight = 0;
        double totalBroccoliWeight = 0;
        double totalLettuceWeight = 0;
        
        for (LeafyGreen veg : veges) {
            double cost = veg.getWeight() * veg.getPrice();
            totalCost += cost;
            
            switch (veg.getType().toLowerCase()) {
                case "cabbage":
                    totalCabbageWeight += veg.getWeight();
                    break;
                case "broccoli":
                    totalBroccoliWeight += veg.getWeight();
                    break;
                case "lettuce":
                    totalLettuceWeight += veg.getWeight();
                    break;
            }
        }
        
        // outputs the calculations 
        System.out.println("Sample run output: ");
        System.out.printf("Total vegetable cost: $%.1f\n", totalCost);
        System.out.printf("Total Cabbage weight: %.1f kg\n", totalCabbageWeight);
        System.out.printf("Total Broccoli weight: %.1f kg\n", totalBroccoliWeight);
        System.out.printf("Total Lettuce weight: %.1f kg\n", totalLettuceWeight);
    }
}
// end of main class

	 

