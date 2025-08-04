package Task8;
// Bag class
public class Bag {
	//Private fields
	private String colour;
	private double capacity;
	
	//Constructor that sets the fields for the Bag class
	public Bag(String colour, double capacity) {
		this.setColour(colour);
		this.setCapacity(capacity);
	}
	
	//Getter for color
	public String getColour() {
		return colour;
	}
	//Setter for color
	public void setColour(String colour) {
		this.colour = colour;
	}
	//Getter for capacity
	public double getCapacity() {
		return capacity;
	}
	//Setter for capacity
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}
// end of Bag class
