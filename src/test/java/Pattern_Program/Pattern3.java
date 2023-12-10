package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern3
{
	@Test
	public void pat3()
	{
	int n=5;
	for(int i=1; i<=n; i++)  
	{                                              // *
		for(int j=i; j<=n; j++)                   // * *
		{                                        // * * *
			System.out.print(" ");              // * * * *
		}                                      // * * * * *
		for(int j=1; j<=i; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
                         