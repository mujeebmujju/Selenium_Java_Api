package Array_Practice_Program;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Second_MaximumNoArray_WithoutusingBubblesort 
{
		@Test
		public void Maximum()
		{
			int[]a= {2,5,6,8,9,10,1}; 
			int max=a[0];
			int secondmax=a[0];
			
			for(int i=0; i<a.length;i++)

			{
				if(max<a[i]) 
				{
					secondmax=max;
					max=a[i];
				}
				else if(a[i]!=max && a[i]>max)
				{
					secondmax=a[i];
				}
			}
		
			System.out.println(secondmax);   
		} 
 @Test
 public void test()
 {
	 int[]a= {10,20,30,40};
	 for(int i=0; i<a.length; i++)
	 {
	     int count=1;
		 for(int j=0; j<a.length; j++)
		 {
			 if(a[i]<a[j])
			 {
				 count++;
			 }
		 }
		 if(count==2)
		 {
			 System.out.println(a[i]);
		 }
	 }
 
}
}


