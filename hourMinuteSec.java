package assignment;
import java.util.Scanner;
public class hourMinuteSec {


	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input seconds: ");
			int seconds = in.nextInt(); 
	        int h1 = seconds % 60;
	        int h2 = seconds / 60;
	        int h3 = h2 % 60;
	        h2 = h2 / 60;
	        System.out.print( h2 + ":" + h3 + ":" + h1);
			System.out.print("\n");
	    }    
	 }
