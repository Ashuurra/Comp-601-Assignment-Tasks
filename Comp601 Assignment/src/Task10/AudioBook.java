package Task10;

//AudioBook class
public class AudioBook extends Book {
	//Private fields
    private double length;

    //Constructor that sets the fields for the AudioBook and Book classes 
    public AudioBook(String name, int year, double length) {
        super(name, year);
        this.length = length;
    }

    //Getter fort length
    public double getLength() {
        return length;
    }

    //Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    //Displays book info
    public void displayInfo() {
        System.out.printf("%-30s %4d %5.1f\n", getName(), getYear(), getLength());
    }
}
//End of AudioBook class