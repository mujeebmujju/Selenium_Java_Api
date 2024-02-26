package string_program;

import org.testng.annotations.Test;

public class Minimum_Length_In_A_String_ 
{
	@Test
	public void test()
	{
		String s = "i am from test yantra";
		String[] s1 = s.split(" ");
		String temp = s1[0]; 
		for (int i = 0; i < s1.length; i++) 
		{
			if (s1[i].length() < temp.length()) 
			{ 
				temp = s1[i];
			}
		}
		System.out.print(temp);
		System.out.println(" ");
	}
}
