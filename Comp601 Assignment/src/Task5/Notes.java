package Task5;
import java.lang.System.*;
// notes class
public class Notes {
	// Private fields
	private String pitch;
	private int duration;

	// Constructor used to set the private fields
	public Notes(String pitch, int duration) {
		this.setPitch(pitch);
	    this.setDuration(duration);
	    }

	// Getter for pitch
	public String getPitch() {
	    return pitch;
	    }
	// Setter for pitch
	public void setPitch(String pitch) {
	    this.pitch = pitch;
	    }

	// Getter for duration
	public int getDuration() {
	    return duration;
	    }

	// Setter for duration
	public void setDuration(int duration) {
	    this.duration = duration;
	    }

	// takes pitch and duration and outputs the message with those fields
	public void playNote() {
	    System.out.println("The note " + pitch + " is played for " + duration + " seconds");
	}
}
//end of notes class