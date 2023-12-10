package string_program;

import org.testng.annotations.Test;

public class Reverse_Each_Word_In_String 
{
	@Test
	public void ReverseWord1()
	{
	String s="i am software engineer";
	String[] word=s.split(" ");
	String reverseword="";
	
	for(String w:word)
	{
		StringBuilder sb = new StringBuilder(w);
	    sb.reverse();
	    reverseword=reverseword+sb.toString()+" ";
	}
	
	System.out.print(reverseword);
		
	}

	
	
	 
	@Test
	public void ReverseWord2()
	{
		String s="i am software engineer";
		String[] st = s.split(" ");
		
		for(int i=0; i<st.length; i++)
		{
			String str=st[i];
			
			for(int j=str.length()-1; j>=0; j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" "); 
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
