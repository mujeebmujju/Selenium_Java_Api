package MOCK_TEST;

import org.testng.annotations.Test;

public class Unique_RemoveDuplicate_Character_In_String  
{
	@Test
	public void Unique()
	{
		String s1="Selenium";
		String s = s1.toLowerCase();
		
		
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
	     	for(int j=0; j<s.length(); j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				if(i>j)
				{
					break;
				} 
				
				else
				{
					count++;
				}
			}
		}
			
			if(count>=1)
			{
				System.out.print(s.charAt(i)+"");
	
			}
			
			

		}
		
		
	}    

	}

