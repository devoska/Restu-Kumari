package assignment;
import java.util.Scanner;
public class IncomeTax {

	int income;
	void data(int income_person)
	{
		income=income_person;
	}
	void tax_cal()
	{
		if(income<=50000)
		{
			System.out.print("nill");
		}
		if(income>50000 && income<=60000)
		{
			income=(income-50000)*10/100;
			System.out.print("Tax include"+income);
		}
		if(income>60000 && income<=1500000)
		{
			income=(income-50000)*20/100;
			System.out.print("Tax include"+income);
		}
		if(income>1500000  )
		{
			income=(income-50000)*30/100;
			System.out.print("Tax include:"+income);
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Income of the person:");
		int income=obj.nextInt();
		Tax a=new Tax();
		a.data(income);
		a.tax_cal();
		
	}


	}


