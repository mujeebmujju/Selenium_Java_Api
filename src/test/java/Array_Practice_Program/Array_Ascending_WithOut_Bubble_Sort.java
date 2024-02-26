package Array_Practice_Program;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Array_Ascending_WithOut_Bubble_Sort 
{
	@Test
	public void test()
	{
	int[]a= {8,5,4,7,6,2,1};
	Arrays.sort(a);
	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]);
	}
	
	}


}
