package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern6 
{
	@Test
	public void pat6()
	{
		int n=5;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)                   // 1
				{                                     // 1 2
					System.out.print(j+" ");          // 1 2 3
	                                                  // 1 2 3 4
				}                                     // 1 2 3 4 5

			System.out.println();
		}
}
}