package string_program; 

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

	public class With_Position_Occurance_of_Each_Character_In_String_Using_HashMap 
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
			    	System.out.println(s.charAt(i)+" is repeating at position "+(i+1));
		
		    	}
		    	else
		    	{   
		    		map.put(s1.charAt(i), 1);
		    	}
		    }
		    for(Entry<Character, Integer> m:map.entrySet())
		    {
		    	if(m.getValue()==1)
		    	{
		    		System.out.println(m.getKey()+" count is "+m.getValue());
		    	}
		    }
		}

	}


