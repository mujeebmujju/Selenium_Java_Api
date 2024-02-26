package string_program;

import org.testng.annotations.Test;

public class Reverse_And_Print_Only_IntegerValues 
{
	@Test
	public void ReverseInteger()
	{
		String s="Aabb12345dd45ee1ff44";
		String []st=s.split("[A-Z a-z]");

		for(int i=st.length-1; i>=0; i--)
		{
			
				System.out.print(st[i]+" ");

			}
		}
	



	@Test
	public void ReverseInteger1()
	{
	String s="Tekion52inter54view234";
	String []st=s.split("[A-Z a-z]");

	for(int i=st.length-1; i>=0; i--)
	{
		System.out.print(st[i]+" ");
	}
}





@Test
public void ReverseInteger2()
{

	String s="Aabb12345dd45ee1ff44";
	String []st=s.split("[A-Z a-z]");
	System.out.print(st[st.length-1]);

	for(int i=st.length-2; i>=0; i--)
	{
		if(st[i].equals(""))
		{
			
		}
		else
		{
			System.out.print(","+st[i]);

		}
	}
}
 


@Test
public void ReverseInteger3()
{

	String s="Aabb12345dd45ee1ff44";
	String []st=s.split("[A-Z a-z]");

	for(int i=0; i<st.length-1; i++)
	{
		if(st[i].equals(""))
		{
			
		}
		else
		{ 
			System.out.print(st[i]+",");

		}
	}
	System.out.print(st[st.length-1]);
}
}





