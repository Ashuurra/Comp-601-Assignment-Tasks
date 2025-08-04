package Task7;
import java.lang.System.*;
import java.util.*;

// Main class
public class Main {
	 public static void main(String[] args) {
	 // Creates a list of shapes
	 List<Shape> shapes = new LinkedList<>();
	 shapes.add(new Shape("white"));
	 shapes.add(new Rectangle("red", 10, 6));
	 shapes.add(new Rectangle("black", 20, 9));
	 shapes.add(new Shape("orange"));
	 showShapeNames(shapes);//produces output part 1

	 // Creates arrays of rectangles with a color and its width and height
	 Rectangle[] rectangleArray1 = {
	 new Rectangle("white", 4, 3),
	 new Rectangle("red", 9, 5),
	 new Rectangle("purple", 3, 6),
	 new Rectangle("orange", 15, 10),
	 new Rectangle("black", 4, 14),
	 };
	 Rectangle[] rectangleArray2 = {
	 new Rectangle("pink", 3, 4),
	 new Rectangle("red", 10, 2),
	 new Rectangle("white", 8, 5),
	 new Rectangle("blue", 14, 4),
	 new Rectangle("bindle", 10, 15),
	 };
	 
	//produces output part 2
	 countOverlapRectangles(rectangleArray1, rectangleArray2);
	 }
	 // Shows the shapes from the shapes list
	 public static void showShapeNames(List<Shape> shapes){
		for (Shape s : shapes) {
            System.out.println(s.getShapeType());
		}

	 }
	 // counts the overlapping rectangle values
	 public static void countOverlapRectangles(Rectangle[] group1, Rectangle[] group2) {	        
		 Set<String> colours1 = new HashSet<>();	        
		 Set<Double> perimeters1 = new HashSet<>();	        
		 for (Rectangle r : group1) {	           
			 colours1.add(r.getColour());	            
			 perimeters1.add(r.getPerimeter());	       
		 }	        
		 int colourOverlap = 0;	        
		 int perimeterOverlap = 0;	        
		 for (Rectangle r : group2) {	           
			 if (colours1.contains(r.getColour())) {	                
				 colourOverlap++;	            
			 }	            
			 if (perimeters1.contains(r.getPerimeter())) {	                
				 perimeterOverlap++;	            
			 }	   
		 }
	       
		 // displays the amount of overlapping values
		 System.out.println("There are " + colourOverlap + " Rectangle objects with overlapping colour between the two arrays");	       
		 System.out.println("There are " + perimeterOverlap + " Rectangle objects with overlapping perimeter between the two array");	   
	 }
}
// end of Main class