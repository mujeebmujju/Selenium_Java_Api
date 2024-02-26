package string_program;

import org.testng.annotations.Test;

public class Count_Of_Upper_Case 
{
	@Test
	public void test()
	{
		String s="JaNuArY";
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
