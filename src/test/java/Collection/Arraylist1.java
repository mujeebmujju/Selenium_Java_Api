 package Collection;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class Arraylist1
{
	@Test
	public void ArrayList()
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(20);
		list.add(50);
		list.add("hi");
		list.add(20);
		list.add(null);
		list.add(null);
		list.add("Hello");
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(50);
		list1.add(30);
		list1.add(60);
		list1.add(10);
	    Collections.sort(list1);
	    System.out.println(list1);
	    
	    for(Integer inte:list1)
	    {
	    	System.out.println(inte);
	    }
	
	}
	
	
	
}