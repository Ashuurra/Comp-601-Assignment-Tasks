package Task7;
//Shape class
public class Shape {
	//Private fields
    private String colour;

    //Constructor that sets the fields for the Shape class
    public Shape(String colour) {
        this.colour = colour;
    }

    //Getter for color
    public String getColour() {
        return colour;
    }

    //Setter for color
    public void setColour(String colour) {
        this.colour = colour;
    }

    //String that returns Shape type
    public String getShapeType() {
        return "I'm a Shape";
    }
}
//end of Shape class