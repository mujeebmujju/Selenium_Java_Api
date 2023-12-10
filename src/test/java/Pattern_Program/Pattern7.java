package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern7 
{
	@Test
	public void pat7()
	{
		int n=5;
		
		for(int i=1; i<=n; i++)
		{
			int k=5;
			for(int j=i; j<=n; j++)                   // 5 4 3 2 1
				{                                     // 5 4 3 2 
					System.out.print(k--+" ");        // 5 4 3 
	                                                  // 5 4 
				}                                     // 5 

			System.out.println();
		}
}
}