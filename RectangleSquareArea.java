package assignment;


		public class  RectangleSquareArea 
		{
		   
		    public static void main(String[] args)
		    {
		        Rectangle obj = new Rectangle();
		        
		        obj.Area(30, 20);
		        
		       
		        Square obj2 = new Square();
		       
		        obj2.Area(20);
		       
		        
		    }
		}
		class Square 
		{
		    void Area(double side)
		    {
		        System.out.println("Area of the Square: "+ side * side);
		    }
		   
		   
		}
		
		
		class Rectangle 
		{
		   
		   
		    void Area(int l, int b)
		    {
		        System.out.println("Area of the rectangle: " + l * b);
		    }
		}
	


