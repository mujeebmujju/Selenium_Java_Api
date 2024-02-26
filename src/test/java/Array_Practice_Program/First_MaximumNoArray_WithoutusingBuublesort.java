package Array_Practice_Program;

import org.testng.annotations.Test;

public class First_MaximumNoArray_WithoutusingBuublesort 
{
	@Test
	public void Maximum()
	{
		int[]a= {2,5,6,8,1};
		int max=a[0];
		
		for(int i=0; i<a.length;i++)

		{
			if(max<a[i]) 
			{
				max=a[i];
			}
		}
		System.out.println(max);
	} 
}