package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class Linkedlist1
{
	@Test
	public void LinkedList()
	{
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(20);
		list.add(50);
		list.add("hi");
		list.add(20);
		list.add(null);
		list.add(null);
		list.add("Hello");
		list.add(30);
		list.add("Bye");
        list.removeFirst();
        list.removeLast();
		System.out.println(list);
	
	    for(Object obj:list)	    
	    {
	    	System.out.println(obj);
	    }
	
	}
	
	
	
}