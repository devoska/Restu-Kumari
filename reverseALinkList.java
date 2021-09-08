package assignment;
import java.util.*;
public class reverseALinkList {

		public static void main(String[] args)
		{
			LinkedList<String> linkedList = new LinkedList<>();
			linkedList.add("This");
			linkedList.add("is");
			linkedList.add("World");
			linkedList.add("of");
			linkedList.add("Nirvana");
			Iterator<String> i = linkedList.descendingIterator();
			while (i.hasNext())
			{
				System.out.println(i.next());
			}
		}
	}

