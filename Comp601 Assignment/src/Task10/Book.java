package Task10;

//Book class
public class Book {
	//Private fields
	private String name;
	private int year;
	
	//Constructor that sets the values for the Book class
	public Book(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	//Getter for name
	public String getName() {
		return name;
	}
	
	//Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter for year
	public int getYear() {
		return year;
	}
	
	//Setter for year
	public void setYear(int year) {
		this.year = year;
	}

}
//End of book class