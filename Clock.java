package assignment;

import java.util.Scanner;

public class Clock {
		int hr,mins,sec;
		Clock(int h,int m,int s)
		{
			hr=h;
			mins=m;
			sec=s;
		}
		void TimeValid()
		{
			if(hr>=0 && hr<24 && mins>=0 && mins<60 && sec>=0 && sec<60)
			{
				System.out.println("time valid");
			}
			else
			{
				System.out.println("time not valid");
			}
		}
			void setTime()
			{
				if(hr<12)
				{
					System.out.println(""+hr+":"+mins+":"+sec+":"+"AM");
				}
				else
				{
					System.out.println(""+hr+":"+mins+":"+sec+":"+"PM");
				}
			}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("hours:");
		int hr=obj.nextInt();
		System.out.print("minutes:");
		int mins=obj.nextInt();
		System.out.print("seconds:");
		int sec=obj.nextInt();
	 Clock a=new Clock(hr,mins,sec);
	 a.TimeValid();
	 a.setTime(); 
	}
}
