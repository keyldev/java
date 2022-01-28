package lab3forNik;
//
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// readline from console
		String word = sc.nextLine();
		int count = sc.nextInt();
		
		// creating an abstract class 
		ABasicBorder frame = new FrameEqual(word,count);
		frame.printFrame(frame.setUpper()  + frame.setBody()  +frame.setBottom());
		
		// use random Frames (~, +, =)
		frame = new FrameTilda(word,count);
		frame.printFrame(frame.setUpper()  + frame.setBody()  +frame.setBottom());
		
		frame = new FramePlus(word,count);
		frame.printFrame(frame.setUpper()  + frame.setBody()  +frame.setBottom());
	}
	
}
