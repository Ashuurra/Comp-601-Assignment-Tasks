package Task8;
import static java.lang.System.*;
import java.util.*;
import java.util.List;

// Main class
public class Main {
	 public static void main(String[] args) {
		 // Creates a list of bags
		 List<Bag> bags = new LinkedList<>();
		 bags.add(new Bag("Blue", 5));
		 bags.add(new Bag("Red", 3.40));
		 bags.add(new Bag("Green", 4.50));
		 
		 // Displays capacity and number of bags
		 BagApp bgapp = new BagApp();
		 double totalCapacity = bgapp.calcTotalCapacity(bags);
		 out.printf("Total capacity: %.2f\n", totalCapacity);
		 out.printf("Total number of bags: %d\n", bags.size());
	 }
}// end of Main class
