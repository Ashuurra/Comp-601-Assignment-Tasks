package Task5;
import java.lang.System.*;
import java.util.*;
// main class
public class Main {
	
	// creates a list of notes 
	public static void main(String[] args){
		 List<Notes> notes = new LinkedList<>();
		 notes.add(new Notes("D", 19));
		 notes.add(new Notes("C", 20));
		 notes.add(new Notes("F", 31));
		 notes.add(new Notes("B", 45));
		 notes.add(new Notes("C", 73));
		 notes.add(new Notes("F", 13));
		 notes.add(new Notes("B", 34));
		 notes.add(new Notes("C", 53));
		 processNotes(notes);

		}
		// Processes the list of notes and takes the note and the duration
		public static void processNotes(List<Notes> notes){
			int totalDuration = 0;
			for (Notes note : notes) {
	            note.playNote(); 
	            totalDuration += note.getDuration();
		
		}
		System.out.printf("Total duration: " + totalDuration + " seconds");
		
	}
}
//end of main class


