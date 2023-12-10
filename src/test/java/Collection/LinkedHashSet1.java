package Collection;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
	@Test
	public void linkedhashset()
	{
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add(10);
		set.add("hi'");
		set.add(20);
		set.add("Hello");
		set.add(20);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		Iterator<Object> it = set.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
	}

}
