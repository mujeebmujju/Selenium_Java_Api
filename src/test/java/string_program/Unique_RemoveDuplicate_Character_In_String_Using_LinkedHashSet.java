 package string_program;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Unique_RemoveDuplicate_Character_In_String_Using_LinkedHashSet
{
	@Test
	public void t()
	{
		String s="Tester";
		String s1=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		
		for(Character ch:set)
		{
			int count =0;
			for(int i=0; i<s1.length(); i++)
			{
				if(ch==s1.charAt(i))
					
				{
					count++;
				}
			}
			
			if(count==1)
			{
			System.out.println(ch+"="+count);
			}

		}
	}

}
