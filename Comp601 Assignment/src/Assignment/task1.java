package Assignment;

import static java.lang.System.*;
 
// Displays given output
public class task1 { 
	public static void main(String[] args) {
        String fmt = "%-30s%-20s\n";
        System.out.printf(fmt, "Escape Sequence:", "Description");
        System.out.println("-".repeat(40));
        System.out.printf(fmt, "\\n", "New Line Character");
        System.out.printf(fmt, "\\t", "Horizontal Tab Character");
        System.out.printf(fmt, "\\\"", "Double Quote Character");
        System.out.printf(fmt, "\\b", "Backspace Character");
    }
}