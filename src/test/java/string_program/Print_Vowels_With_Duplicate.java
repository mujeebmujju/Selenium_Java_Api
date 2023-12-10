package string_program;

import org.testng.annotations.Test;

public class Print_Vowels_With_Duplicate 
{
	@Test
	public void VowelsDuplicate()
	{
		String st="india";
		char[] ch = st.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u')
			{
				count++;
				
				System.out.println(ch[i]);
				
			}
		}
	}

}
