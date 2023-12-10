package string_program;

import org.testng.annotations.Test;

public class Segrigate_Alpha_Numeric_Special_Character
{
	@Test
	public void segrigate()
	{
		String s="a1c$d3R%";
		String alpha=" ";
		String num=" ";
		String spe=" ";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if (s.charAt(i)>='1' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
				
			}
			else
			{
				spe=spe+s.charAt(i);
			}
		}
		
		System.out.println(alpha+num+spe);
	}
	

}
