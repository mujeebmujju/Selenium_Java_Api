package Array_Practice_Program;

import org.testng.annotations.Test;

public class Maximum_Minimum_Number_In_Array 
{
	@Test
	public void Maximum()
	{
		int[]a= {2,5,6,8,1};
		int max=a[0];
		int min=a[0];

		for(int i=0; i<a.length;i++)
		{
			if(max<a[i]) 
			{
				max=a[i];
			}
			else 
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}



