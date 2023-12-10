package string_program;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Print_Vowels_WithOut_Duplicate_Using_LInkedHashSet 
{
	@Test
	public void VowelsWoDuplicate()
	{
		String s="india";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		 
		    
		    for(Character ch:set)
		    {
		    	int count=0;
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u')
			{
				count++;
				
				System.out.println(ch);
				
			}
		}
	}

}
