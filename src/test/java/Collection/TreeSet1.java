package Collection;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 
{
	@Test
	public void linkedhashset()
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(5);
		set.add(20);
		set.add(6);
		set.add(0);
		System.out.println(set);
		
		
		Iterator<Integer> it = set.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		
		System.out.println(set.descendingSet());
	}

}
