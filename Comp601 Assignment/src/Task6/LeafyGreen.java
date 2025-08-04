package Task6;

// LeafyGreen class
public class LeafyGreen extends Vegetable {
	// private fields
    private String type;

    // constructor that sets the private fields as well as fields from the Vegetable class
    public LeafyGreen(double weight, double price, String type) {
        super(weight, price);
        setType(type);
    }

    // Getter for type
    public String getType() {
        return type;
    }

   
    // setter for type
    public void setType(String type) {
        if (type.equalsIgnoreCase("cabbage") ||
            type.equalsIgnoreCase("lettuce") ||
            type.equalsIgnoreCase("broccoli")) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Invalid leafy green type.");
        }
    }
}
//end of LeafyGreen class