package Assignment;


import static java.lang.System.*;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score;

        // prompt to enter a score
        while (true) {
            out.print("Enter a score: ");
            score = Double.parseDouble(input.nextLine());

            // checks if the score given meets the requirements and then is given a grade
            if (score >= 0 && score <= 100) {
                out.printf("Score %.1f will receive grade ", score);

                // gives a grade depending on the score given
                if (score < 50) {
                    out.println('D');
                } else if (score < 70) {
                    out.println('C');
                } else if (score < 80) {
                    out.println('B');
                } else {
                    out.println('A');
                }
                break; // Exit after displaying the grade
            } else {
                out.println("Invalid score");
            }
        }

        input.close();
    }
}
