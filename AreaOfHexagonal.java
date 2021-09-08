package assignment;

public class AreaOfHexagonal {

	
		public static double hexa(double s)
		{
			return ((3*Math.sqrt(3) *
					(s*s))/2);
		}
		public static void main(String[] args)
		{	
			double s = 10;	
			System.out.print("Area: "+hexa(s) );
		}
	

	}


