package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern1 
{
	@Test
	public void Pat1()
	{
		int n=5;
		for(int i=0; i<=n; i++)                   // *
		{                                        //  * *
			for(int j=0; j<=i; j++)             //   * * *
			{                                  //    * * * *
				System.out.print("* ");       //     * * * * *
			}                                //      * * * * * *
			System.out.println();
		}
	}

}
