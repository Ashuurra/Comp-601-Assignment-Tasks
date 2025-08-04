package Task9;
import java.lang.System.*;
import java.io.*;

//Main class
public class Main {
	// Looks for the gamedata.txt file  
	public static void main(String[] args) {
		String txtfile = "data/gamedata.txt";
		try {
			GameApp app = new GameApp(txtfile);
			app.game();
		}catch(IOException ioe) {
			System.out.printf("Perhaps missing text file: %s/%s? \n\n",
					new Main().getClass().getPackage().getName(), txtfile);
		}	 
	}	
}// end of Main class

