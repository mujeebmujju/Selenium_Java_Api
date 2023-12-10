package Map;

import java.util.Hashtable;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class HashTable1_Test
{
	@Test
	public void HashTable()
	{
		Hashtable<Integer, String> map = new Hashtable<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
	  //map.put(null, "bye"); not allowed
	 //map.put(10, null); not allowed

		//to iterate
		
		for(Entry<Integer,String>m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	
		//to iterate
		for(Integer i:map.keySet())
		{
			System.out.println(i);
		}
	}
	
	
}