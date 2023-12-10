package string_program;

import org.testng.annotations.Test;

public class Find_Minimunm_LengthValues_In_String_Array 
{
	@Test
	public void MinLength()
	{
		String []s= {"ab","abc","abcd","ef","edcf"};
        String minLength=s[0];
        for(int i=0; i<s.length; i++)

		{
			if(minLength.length()>s[i].length()) 
			{
				minLength=s[i];
			}
		}
        
        for(int i=0; i<s.length; i++)
        {
        	if(minLength.length()==s[i].length())
        	{
        		System.out.println(s[i]+" ");

        	}
        }

	}

}
		
		
		
	