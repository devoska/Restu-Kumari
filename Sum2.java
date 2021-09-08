package assignment;
import java.util.Scanner;
public class Sum2 {
	public static void main(String args[])  
	{  
	int n,dig,sum = 0;  
	Scanner c = new Scanner(System.in);  
	System.out.print("Enter the number: ");  
	n = c.nextInt();  
	while(n>0)  
	{  
	dig=n%10;    
	sum=sum+dig;   
	n=n/10;  
	}  
	System.out.println("Sum of Digits: "+sum);  
	}  
	}  


