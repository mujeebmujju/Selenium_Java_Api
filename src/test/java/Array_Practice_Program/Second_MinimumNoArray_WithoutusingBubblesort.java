package Array_Practice_Program;

import org.testng.annotations.Test;

public class Second_MinimumNoArray_WithoutusingBubblesort 
{
        @Test
		public void Minimum()
		{
			int[]a= {3,5,2,8,1,10};
			int min=a[0];
			int secondmin=a[0];
			
			for(int i=0; i<a.length;i++)

			{
				if(min>a[i]) 
				{
					secondmin=min;
					min=a[i];
				}
				else if(a[i]!=min && a[i]<min)
				{
					secondmin=a[i];
				}
			}
		
			System.out.println(secondmin);
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
			 if(a[i]>a[j])
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



