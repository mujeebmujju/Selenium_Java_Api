package string_program;

import org.testng.annotations.Test;

public class Reverse_Character_Special_Position_Same 
{
		public static void main(String[] args) 
		{
			String s="ab@s%y%m";
			String s1="";
			for(int i=0;i<s.length();i++) 
			{
				if(s.charAt(i)>='a'&&s.charAt(i)<='z') 
				{
					s1=s1+s.charAt(i);
						
				}
			}
			int count=s1.length()-1;
			for(int i=0;i<s.length();i++)
			{
				if((s.charAt(i)>='a'&&s.charAt(i)<='z')) 
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
	public void test()
	{
		String s="ab@s%y%m";
	   String s1 = s.replaceAll("[^a-z A-Z]", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z'|| s.charAt(i)>='a'&& s.charAt(i)<='z')
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

