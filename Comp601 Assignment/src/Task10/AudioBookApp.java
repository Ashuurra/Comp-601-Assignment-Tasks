package Task10;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
// AudioBookApp class
public class AudioBookApp {
	 //Private fields
	 private List<AudioBook> bookList;
	 public List<AudioBook> getBookList() {
	 return bookList;
	 }
	 //Constructor that sets the fields for the AudioBookApp class
	 public AudioBookApp(String books) throws IOException {
	 bookList = new LinkedList<>();
	 readData(books);
	 }
	 //Reads data from bookdata.txt and splits into name, year and length categories
	 public void readData(String books) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(books));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 3) {
	                String name = parts[0].trim();
	                int year = Integer.parseInt(parts[1].trim());
	                double length = Double.parseDouble(parts[2].trim());
	                bookList.add(new AudioBook(name, year, length));
	            }
	        }
	        reader.close();
	    }
	 
	 //Returns the shortest books
	 public List<AudioBook> getShortestBooks() {
	        List<AudioBook> result = new ArrayList<>();
	        double minLength = Double.MAX_VALUE;

	        for (AudioBook book : bookList) {
	            if (book.getLength() < minLength) {
	                minLength = book.getLength();
	            }
	        }

	        for (AudioBook book : bookList) {
	            if (book.getLength() == minLength) {
	                result.add(book);
	            }
	        }
	        return result;
	    }
	 //Counts books published between 2010 and 2020
	 public int countBooks() {
	        int count = 0;
	        for (AudioBook book : bookList) {
	            if (book.getYear() >= 2010 && book.getYear() <= 2020) {
	                count++;
	            }
	        }
	        return count;
	    }
	 //Splits book data into three lists 
	 public void randomBookList() {
		List<AudioBook> b1 = new ArrayList<>();
	    List<AudioBook> b2 = new ArrayList<>();
	    List<AudioBook> b3 = new ArrayList<>();
	    
	    Random rand = new Random();
	    
	    for(AudioBook book : bookList) {
	    	int r = rand.nextInt(3) + 1;
	    	switch(r) {
	    	case 1 -> b1.add(book);
	    	case 2 -> b2.add(book);
	    	case 3 -> b3.add(book);
	    	}
	    }
	    
	    //Displays data in each of the lists
	    System.out.printf("%d books in list #1:\n", b1.size());
        for (AudioBook book : b1) book.displayInfo();

        System.out.printf("%d books in list #2:\n", b2.size());
        for (AudioBook book : b2) book.displayInfo();

        System.out.printf("%d books in list #3:\n", b3.size());
        for (AudioBook book : b3) book.displayInfo();


	 }
}
//end of AudioBookApp class