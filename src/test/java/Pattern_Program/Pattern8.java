package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern8 
{
	@Test
	public void pat8()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)                   // 1
			{                                         // 2 2
				if(i%2==0)                            // 1 1 1
				{                                     // 2 2 2 2
					System.out.print("2 ");           // 1 1 1 1 1
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
