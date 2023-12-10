package string_program;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.Test;

public class Occurance_Of_EachCharacter_Using_HashMap 
{
	@Test
	public void Occurance()
	{
		String s="Tester";
	    String s1 = s.toLowerCase();
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    for(int i=0; i<s1.length();i++)
	    {
	    	if(map.containsKey(s1.charAt(i)))
	    	{
		    	map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
	
	    	}
	    	else
	    	{
	    		map.put(s1.charAt(i), 1);
	    	}
	    }
	    for(Entry<Character, Integer> m:map.entrySet())
	    {
	    	if(m.getValue()>=1)
	    	{
	    		System.out.println(m.getKey()+" "+m.getValue());
	    	}
	    }
	}

}
