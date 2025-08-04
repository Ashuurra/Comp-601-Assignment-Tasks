package Task9;

// Country class
public class Country {
	// Private fields
    private String name;
	private String capital;
	private int population;

	// Constructor that sets the fields of the Country class
	public Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }
	// Getter for name
    public String getName() {
        return name;
    }
    //Getter for capital
    public String getCapital() {
        return capital;
    }
    // Getter for population
    public int getPopulation() {
        return population;
    }
}
// end of Country class