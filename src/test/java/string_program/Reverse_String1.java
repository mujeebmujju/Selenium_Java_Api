package string_program;

import org.testng.annotations.Test;

public class Reverse_String1 
{
	@Test
    public void Reversestring3()
    {	
		String s="a guy sitting in a chair";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
    
     
	@Test
	public void ReverseTest()
	{
		String s= "a guy sitting in a chair";
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	
	
	
	
	}



