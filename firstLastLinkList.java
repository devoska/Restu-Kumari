package assignment;
import java.util.*;
public class firstLastLinkList {

		  public static void main(String[] args) {
		     LinkedList<String> list = new LinkedList<String>();
		     list.add("olive green");
			  list.add("teal");
			  list.add("beige");
			  list.add("Orange");
			  list.add("White");
		     System.out.println("linked list" +list);    
		    list.addFirst("gray");
		    list.addLast("yellow");
		     System.out.println("after linked list" +list);  
		 }
		}
