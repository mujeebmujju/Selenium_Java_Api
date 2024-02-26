package Array_Practice_Program;

import org.testng.annotations.Test;

public class Array_Descending_With_Bubble_Sort_Using_2Integer_Array 
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
		for(int i=0; i<a2.length;i++)
		{
			for(int j=i+1; j<a2.length; j++)
			{
				if(a2[i]<a2[j])
				{
					int temp=a2[i];
					a2[i]=a2[j];
					a2[j]=temp;
				}
					
			}
			System.out.print(a2[i]+" ");
		}
		
	}
}
