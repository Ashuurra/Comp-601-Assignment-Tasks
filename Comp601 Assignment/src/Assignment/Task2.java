package Assignment;

import static java.lang.System.*;
import java.util.Scanner;

public class Task2 {
	static Scanner input = new Scanner(in);

	// format for calculation
	public static void main(String[] args) {
        double radius, area, perimeter, diameter;
        String fmt1 = "%-20s%-20s%-20s\n";
        String fmt2 = "%-20.2f%-20.2f%-20.2f\n";

        // prompt for the Radius that will be used in calculation
        out.print("Enter Radius: ");
        radius = Double.parseDouble(input.nextLine());

        // Calculates diameter, perimeter and area using the radius value given
        diameter = radius * 2;
        perimeter = diameter * Math.PI;
        area = Math.pow(radius, 2) * Math.PI;

        // Displays the values
        out.printf(fmt1, "Radius", "Perimeter", "Area");
        out.println("-".repeat(45));
        out.printf(fmt2, radius, perimeter, area);

	}

}
