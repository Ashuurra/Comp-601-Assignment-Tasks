package Task7;
// Rectangle class
public class Rectangle extends Shape {
	//Private fields
    private double height;
    private double width;

    // Constructor that sets the private fields of the Recatangle and Shape classes
    public Rectangle(String colour, double height, double width) {
        super(colour); // This calls the Shape constructor
        this.height = height;
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Overrides getShapeType from the Shape class
    @Override
    public String getShapeType() {
        return "I'm a Rectangle";
    }

    // calculates the perimeter of the Rectangles
    public double getPerimeter() {
        return 2 * (height + width);
    }
}
// end of Rectangle class
