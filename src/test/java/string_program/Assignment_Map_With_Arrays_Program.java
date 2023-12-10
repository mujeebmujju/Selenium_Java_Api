package string_program;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Assignment_Map_With_Arrays_Program 
{
	@Test

	public void UniqueNumber() 
	{
		int a[]= {5,4,4,2,5,4,2,1};
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer> ();

		for (int i = 0; i < a.length; i++) 
		{
			if(map.containsKey(a[i])) 
			{
				map.put(a[i],map.get(a[i])+1);

			}
			else
			{
				map.put(a[i],1);
			}

		}
		
		System.out.println("Only uniques Number");
		for(Entry<Integer, Integer>m:map.entrySet())
		{
			if(m.getValue()==1) 
			{
				System.out.println(m.getKey()+"  "+m.getValue());
			}
		}
	}
	
	
	
@Test
public void OccurenceofEachNumber() 
{
	int a[]= {5,4,4,2,5,4,2,1};
	HashMap<Integer, Integer> map=new HashMap<Integer, Integer> ();

	for (int i = 0; i < a.length; i++) 
	{
		if(map.containsKey(a[i]))
		{
			map.put(a[i],map.get(a[i])+1);

		}
		else
		{
			map.put(a[i],1);
		}

	}
	
	System.out.println("Occurence of each Number");
	for(Entry<Integer, Integer>m:map.entrySet()) 
	{
		if(m.getValue()>=1) 
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
}



@Test
public void OnlyDuplicateNum() 
{
	int a[]= {5,4,4,2,5,4,2,1};
	HashMap<Integer, Integer> map=new HashMap<Integer, Integer> ();

	for (int i = 0; i < a.length; i++)
	{
		if(map.containsKey(a[i])) 
		{
			map.put(a[i],map.get(a[i])+1);

		}
		else
		{
			map.put(a[i],1);
		}

	}
	
	System.out.println("only Dupicates num");
	for(Entry<Integer, Integer>m:map.entrySet()) 
	{
		if(m.getValue()>1) 
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
} 


@Test

public void RemoveDuplicates() 
{
	int a[]= {5,4,4,2,5,4,2,1};
	HashMap<Integer, Integer> map=new HashMap<Integer, Integer> ();

	for (int i = 0; i < a.length; i++)
	{
		if(map.containsKey(a[i])) 
		{
			map.put(a[i],map.get(a[i])+1);

		}
		else
		{
			map.put(a[i],1);
		}

	}
	
	System.out.println("revome duplicates Number");
	
	   for(Entry<Integer, Integer>m:map.entrySet()) 
	      
	    if(m.getValue()==1) 
	    {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	
}
}
