package assignment;

		class DisplayOverloading
		{
		   public void disp(char c, int num)
		   {
		       System.out.println("char:" +c);
		   }
		   public void disp(int num, char c)
		   {
		       System.out.println("number:" +num );
		   }
		}
	public	class CharNumber
		{
		   public static void main(String args[])
		   {
		       DisplayOverloading obj = new DisplayOverloading();
		       obj.disp('r', 22);
		       obj.disp(23, 's');
		   }
		
	}


