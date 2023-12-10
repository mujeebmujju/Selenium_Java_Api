package Array_Practice_Program;

import org.testng.annotations.Test;

public class Sum_Of_Minimum3_No_InArray 
{
	@Test
	public void sumofMinimum3NoinArray()
	{
		int[]a= {0,5,2,6,8};
		
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
		
		 int sum=0;
		 for(int i=0; i<3; i++)
		 {
			 sum=sum+a[i];
		 }
		 System.out.println(sum);
	}

}
