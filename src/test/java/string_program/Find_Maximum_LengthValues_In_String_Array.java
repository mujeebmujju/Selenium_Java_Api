package string_program;

import org.testng.annotations.Test;

public class Find_Maximum_LengthValues_In_String_Array 
{
	@Test
	public void MaxLength()
	{
		String []s= {"ab","abc","abcd","ef","edcf"};
        String maxLength=s[0];
        for(int i=0; i<s.length; i++)

		{
			if(maxLength.length()<s[i].length()) 
			{
				maxLength=s[i];
			}
		}
        
        for(int i=0; i<s.length; i++)
        {
        	if(maxLength.length()==s[i].length())
        	{
        		System.out.println(s[i]+" ");

        	}
        }

	}

}
		
		
		
	