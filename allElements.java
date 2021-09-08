package assignment;


import java.util.*;
public class allElements {
	public static void main(String[] args) {
	     LinkedList<String> list = new LinkedList<String>();
	     list.add("Black");
		  list.add("Green");
		  list.add("Red");
		  list.add("Orange");
		  list.add("White");
	   System.out.println("linked list" + list);
	Iterator a = list.listIterator();
	   while (a.hasNext()) {
	   System.out.println(a.next());
}
	}
}

