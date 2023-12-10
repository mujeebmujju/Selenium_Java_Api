package Number_Series_programs;

import org.testng.annotations.Test;

public class Factorial_Series 
	{
	@Test
	
		public void Factorial() 
		{
			int i=1, fact=1;
			while(i<=5)
			{
			fact=fact*i;
			i++;
			}
			System.out.println(fact);
			
			
		}
	}



