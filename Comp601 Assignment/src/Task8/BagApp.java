package Task8;

import java.util.List;
// BagApp class
public class BagApp {
	// Calculates that total capacity of all the bags
	 public double calcTotalCapacity(List<Bag> bagList) {
		 if (bagList.isEmpty()) {
			 return 0.0;
		 }else {
			 Bag firstBag = bagList.get(0);
			 List<Bag> restOfBags = bagList.subList(1, bagList.size());
	         return firstBag.getCapacity() + calcTotalCapacity(restOfBags);
		 }
}
}// end of BagApp class