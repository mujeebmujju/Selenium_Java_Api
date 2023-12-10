package Number_Series_programs;

import org.testng.annotations.Test;

public class Fibonacci_Series 
	{
	@Test
	
		public void Fibonacci() 
		{
			int n1=0,n2=1,sum=0;
			int i=1;
			
			while(i<=10)
			{
				sum=n1+n2;
				n1=n2;
				n2=sum;
			System.out.println(sum);
			i++;
			}
		}
	}



