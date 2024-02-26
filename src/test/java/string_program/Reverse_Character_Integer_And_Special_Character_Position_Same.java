package string_program;

import org.testng.annotations.Test;

public class Reverse_Character_Integer_And_Special_Character_Position_Same 
{
	@Test
public void test()
	{
		String s="ab@s%4%m";
	   String s1 = s.replaceAll("[^a-z A-Z 0-9]", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z'|| s.charAt(i)>='a'&& s.charAt(i)<='z'|| s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}

	
	@Test
	public void test1()
	{
		String s="Mu12jee3b";
		String[] s1 = s.split("[a-z A-Z]");
		for(int i=0; i<s1.length; i++)
		{
				System.out.print(s1[i]);
			
		}
	}
}
 


