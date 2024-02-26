package string_program;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Assignment_Map_String_Program 
{
	@Test
	public void UniquesWords() 
	{
		String s="hi hello hi hello welcome";
		String[] str = s.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer> ();

		for (int i = 0; i < str.length; i++) 
		{
			if(map.containsKey(str[i])) 
			{
				map.put(str[i],map.get(str[i])+1);
				
			}
			else
			{
				map.put(str[i],1);
			}
			
		}
		System.out.println("Only uniques words");
		
		for(Entry<String, Integer>m:map.entrySet())
		{
			if(m.getValue()==1) 
			{
				System.out.println(m.getKey()+"   "+m.getValue());
			}
		}
	}
	
	
	
	
	
	@Test
	public void OrderOFOccurenceEachWord() 
	{
		String s="hi hello hi hello welcome";
		String[] str = s.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer> ();

		for (int i = 0; i < str.length; i++)
		{
			if(map.containsKey(str[i])) 
			{
				map.put(str[i],map.get(str[i])+1);
				
			}
			else
			{
				map.put(str[i],1);
			}
			
		}
		System.out.println("Order Of Occurence Each Word with count");
		for(Entry<String, Integer>m:map.entrySet()) 
		{
			if(m.getValue()>=1) 
			{
				System.out.println(m.getKey()+"   "+m.getValue());
			}
		}
	}
	
	
	
	@Test
	public void DuplicateOnlyWithCount() 
	{
		String s="hi hello hi hello welcome";
		HashMap<String, Integer> map=new HashMap<String, Integer> ();
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) 
		{
			if(map.containsKey(str[i])) 
			{
				map.put(str[i],map.get(str[i])+1);
				
			}
			else
			{
				map.put(str[i],1);
			}
			
		}
		
		System.out.println("Duplicate Only With Count");
		for(Entry<String, Integer>m:map.entrySet())
		{
			if(m.getValue()>1) 
			{
				System.out.println(m.getKey()+"   "+m.getValue());
			}
		}
	}
	
}
	