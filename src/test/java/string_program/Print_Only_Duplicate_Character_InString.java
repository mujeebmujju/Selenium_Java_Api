package string_program;

import org.testng.annotations.Test;

public class Print_Only_Duplicate_Character_InString
{
	@Test
	public void Duplicate()
	{
		String s1="Tester";
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
			
			if(count>1)
			{
				System.out.println(s.charAt(i)+"="+count);

			}

		}
	}

	}

