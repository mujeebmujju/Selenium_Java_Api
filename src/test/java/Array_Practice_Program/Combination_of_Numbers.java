package Array_Practice_Program;

import org.testng.annotations.Test;

public class Combination_of_Numbers 
{
	@Test
	public void Combination()
	{
		int[]a= {8,2,3,7,6,4,9,5};
		int sum=11;
		
		for(int i=0; i<a.length; i++)
		{
			int c=sum-a[i];
	        System.out.println(a[i]+""+"+"+c+"="+sum);

		}
	
	}
	
	

}
