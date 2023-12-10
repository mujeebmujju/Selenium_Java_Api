package Number_Series_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Smallest_Even_No_In_Array 
{
	@Test
	public void SmaEvenInArray()
	{
		int[]a= {5,3,2,1,7,8,4};
		 int temp=a[0];
		 
		 for(int i=0; i<a.length; i++)
		 {
			 if(a[i]%2==0)
			 {
				 if(temp>a[i])
				 {
					 temp=a[i];
					 
				 }
			 }
		 }
		 System.out.println(temp +" "+ "is the smallest Even No");

	}
}