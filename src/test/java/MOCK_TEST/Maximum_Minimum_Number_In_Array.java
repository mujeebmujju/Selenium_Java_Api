package MOCK_TEST;

import org.testng.annotations.Test;

public class Maximum_Minimum_Number_In_Array 
{
		@Test
		public void Maximum()
		{
			int[]a= {4,5,3,2,7,1};
			int max=a[0]; //4  //5   //5  //5  //7  //7
			int min=a[0]; //4  //4   //3  //2  //2 //1
			
			for(int i=0; i<a.length;i++)
				

			{
				if(max<a[i]) 
				{
					max=a[i];
				}
				else if (min>a[i])
				{
					min=a[i];
				}
			}
			System.out.println(max);
			System.out.println(min);
		}

	}



