package string_program;

import org.testng.annotations.Test;

public class String_Imp2 
{
	@Test
	public void test()
	{
		String s="I LOVE TYSS";
		String s1=s.replaceAll(" ","");  // ILOVETYSS
		int count=s1.length()-1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{ 
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

























 