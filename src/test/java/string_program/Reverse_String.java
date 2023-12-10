package string_program;

import org.testng.annotations.Test;

public class Reverse_String 
{
	@Test
	public void ReverseString()
	{
		String s="i am software engineer";
		String[] st = s.split(" ");
		
		for(int i=st.length-1; i>=0; i--)
		{
			System.out.print(st[i]+" ");
		}
	}

}
