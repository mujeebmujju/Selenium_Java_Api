package Number_Series_programs;

import org.testng.annotations.Test;

public class Prime_No_In_Array
{
	@Test
	public  void PrimeInArray() 
		{
		  int []a= {7,4,2,1,5,9,8,3};
           for(int i=0 ;i<a.length; i++)
			{
				int count=0;
				for(int j=1; j<a.length; j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
			
				if(count==2)
				{
				System.out.println(i);
				}
		
				}

			}
		}







