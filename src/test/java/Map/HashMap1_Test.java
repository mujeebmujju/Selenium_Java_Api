package Map;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class HashMap1_Test
{
	@Test
	public void HashMap()
	{
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hi");
		map.put(10, "bye");
		map.put(10, "hello");
		map.put(null, "bye");
		map.put(70, null);
		map.put(80, null);
	  

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