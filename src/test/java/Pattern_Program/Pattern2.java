package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern2
{
	@Test
	public void Pat2()
	{
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=5; j++)
			{
				if(i<j)
				{
					System.out.print("* ");       // * * * * *
					                              // * * * * 
				}                                 // * * *
			}                                     // * *
			System.out.println();                 // *
		}
	}




//Approach 2
@Test
public void Pat22()
{
	int n=5;
			
	for(int i=1; i<=n; i++)
	{
		for(int j=i; j<=n; j++)                   // * * * * *
			{                                     // * * * *
				System.out.print("* ");           // * * *
                                                  // * *
			}                                     // *

		System.out.println();
	}
}
}


