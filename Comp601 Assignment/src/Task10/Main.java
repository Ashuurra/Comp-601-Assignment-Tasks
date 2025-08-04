package Task10;

import java.io.IOException;
import java.util.List;
//Main class
public class Main {

	public static void main(String[] args) {
		// Creates an app using bookdata.txt 
		String txtfile = "data/bookdata.txt";
		try {
		
			// shows book data from the text file
			AudioBookApp app = new AudioBookApp(txtfile);
			System.out.println("Shortest books:");
			System.out.printf("%-30s %-4s %-5s\n", "Title", "Year", "Length");
            System.out.println("-".repeat(50));
			displayBooks(app.getShortestBooks());
			System.out.printf("Books published btw 2010-2020: %d\n", app.countBooks());
			app.randomBookList();
		}catch(IOException ioe) {
			System.out.printf("Perhaps missing text file: %s/%s? \n\n",
					new Main().getClass().getPackage().getName(), txtfile);
		}
			
		}

	    // Displays book info
		public static void displayBooks(List<AudioBook> list) {
			for (AudioBook book : list) {
		        book.displayInfo();

			}
			        
		}
	}
//End of main class
