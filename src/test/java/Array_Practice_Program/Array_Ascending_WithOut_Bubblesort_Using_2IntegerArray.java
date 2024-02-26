package Array_Practice_Program;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Array_Ascending_WithOut_Bubblesort_Using_2IntegerArray
{
	@Test
	public void test()
	{
		int[]a= {2,8,9,7,6};
		int[]a1= {1,3,5,10};
		int[]a2=new int[a.length+a1.length];
		for(int i=0; i<a.length; i++)
		{
			 a2[i]=a[i];
			
		}
		for(int j=0; j<a1.length; j++)
		{
			a2[a.length+j]=a1[j];
		}
		
		Arrays.sort(a2);
		for(int i=0; i<a2.length; i++)
		{
			System.out.print(a2[i]+"");
		}



	}

}
