package Array_Practice_Program;

import org.testng.annotations.Test;

public class MaximumNumber_InArray 
{
	@Test
	public void Maximum()
	{
		int[]a= {0,5,55,58,23,14,};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		
		}
		//a[0]=0 a[1]=5 a[2]=14 a[3]=23 a[4]=55
		System.out.println(a[0]);

	}
}
