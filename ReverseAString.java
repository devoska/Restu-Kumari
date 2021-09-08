package assignment;

import java.util.*;
public class ReverseAString {
	    public static void main(String[] args) {  
	    	List<String> list_Strings = new ArrayList<String>();
	  	  list_Strings.add("Black");
	  	  list_Strings.add("Green");
	  	  list_Strings.add("Red");
	  	  list_Strings.add("Orange");
	  	  list_Strings.add("White");
	        System.out.println("Before_Reverse");  
	        System.out.println(list_Strings.toString());        
	        Collections.reverse(list_Strings);  
	        System.out.println("After_Reverse");  
	        System.out.println(list_Strings);  
	    }  
	}  