package Array_Practice_Program;

import org.testng.annotations.Test;

public class Multiplication_Of_Minimum3_No_InArray 
{
	@Test
	public void MultiplicationofMinimum3NoinArray()
	{
		int[]a= {1,5,2,6,8};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		
		}
		
		 int product=1;
		 for(int i=0; i<3; i++)
		 {
			 product=product*a[i];
		 }
		 System.out.println(product);
	}

}
