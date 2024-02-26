package string_program;

import org.testng.annotations.Test;

public class Reverse_Split_Each_Word 
{

	@Test
	public void test()
	{
		String s="I am from Bangalore";
		String[] str = s.split(" ");
		
		for (int i=0; i<str.length; i++)
		{
			String temp = str[0];
			
			for(int j=1; j<str.length; j++)
			{
				str[j-1]=str[j];
				System.out.print(str[j]+" ");
			}
			
			str[str.length-1]=temp;
			System.out.println(temp);
		}
  
	}
}



