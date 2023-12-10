package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class HashSet1
{
	@Test
	public void Hasshset()
	{
	
		 HashSet<Object> set = new HashSet<Object>();
		 set.add(10);
		 set.add("hi");
		 set.add(20);
		 set.add("Bye");
		 set.add(20);
		 set.add(null);
		 set.add(null);
		 System.out.println(set);
		 
		 ArrayList<Object> list = new ArrayList<Object>();
		 list.add(10);
		 list.add(10);
		 list.add(null);
		 list.add(null);
		 System.out.println(list);
		 
		 Iterator<Object> it = list.iterator();
		 

		 while (it.hasNext())
			 
		 {
			 System.out.println(it.next());			
		 }
		  
		 
//		 for(Object set1:set)
//		 {
//			 System.out.println(set1);
//		 }
		 
		 
		 
	}

}
