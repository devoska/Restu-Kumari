package assignment;
import java.util.*;
public class specialElement {

		public static void main(String[] args) {
		     LinkedList<String> list = new LinkedList<String>();
		     list.add("olive green");
			  list.add("teal");
			  list.add("beige");
			  list.add("Orange");
			  list.add("White");
		   System.out.println("linked list" + list);
		Iterator a = list.listIterator(3);
		   while (a.hasNext()) {
		   System.out.println(a.next());
	}
		}
	}

