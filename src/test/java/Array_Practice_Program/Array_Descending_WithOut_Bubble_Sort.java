package Array_Practice_Program;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Array_Descending_WithOut_Bubble_Sort 
{
	@Test
	public void test()
	{
	int[]a= {8,5,4,7,6,2,1};
	Arrays.sort(a);
	for(int i=a.length-1; i>=0; i--)
	{
		System.out.print(a[i]+" ");
	}
	
	}


}
