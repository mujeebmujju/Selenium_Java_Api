 package string_program;

import org.testng.annotations.Test;

public class Swap_1st_And_LastWord_InString
{
	@Test
	public void Swap1stAndLastFromString()
	{
		String s="i am software engineer";
		String[] st = s.split(" ");
		
		//st[0]=i  st[1]=am  st[2]=software  st[3]=engineer
		
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		
		for(int i=0; i<st.length; i++)
		{
			System.out.print(st[i]+" ");
		}
		
	}

}
 