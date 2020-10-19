package stanfordMidterm;
import acm.program.*;

public class SecondLargest  extends ConsoleProgram{
	private static final int SENTINEL = 0;
	public void run() {
		startLines();
		int largest = -1;
		int secondLargest = -1;
		
		
		while (true) {
		int input = readInt(" ? ");
		if (input == SENTINEL) break;
		if (input > largest) {
			secondLargest = largest;
			largest = input;
		} else if (input > secondLargest) {
			secondLargest = input;
			}
		}
		println("The largest value is " + largest);
		println("The second largest is " + secondLargest);
		}
	
	public void startLines() {
		System.out.println("This program find the two largest integer in a ");
		System.out.println("list. Enter values, one per line, using a " + SENTINEL + " to ");
		System.out.println("signal the end of the list.");
	}
	

}
