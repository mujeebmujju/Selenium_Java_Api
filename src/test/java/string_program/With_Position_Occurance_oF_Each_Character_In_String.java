package string_program;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class  With_Position_Occurance_oF_Each_Character_In_String
{
	@Test
	public void Occurance()
	{
		String s1="tester";

		ArrayList<Object> list=new ArrayList<Object>();
		for(int i=0; i<s1.length(); i++)
		{
			if(list.contains(s1.charAt(i)))
			{
				System.out.println(s1.charAt(i)+" is repeating at position "+ (i+1));
			}
			else
			{
				list.add(s1.charAt(i));
			}
		}
		for(int i=0; i<s1.length(); i++)
		{
			int count=0;
			for(int j=0; j<s1.length(); j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
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
				System.out.println(s1.charAt(i)+" is repeating "+count);

			}

		}
	}

}




