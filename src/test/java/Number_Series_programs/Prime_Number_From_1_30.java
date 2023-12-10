package Number_Series_programs;

import org.testng.annotations.Test;

public class Prime_Number_From_1_30 
{
	@Test
	public void Prime()
	{
		int n=1;
		int p=30;
		
		for(int i=n; i<=p; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
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
			else
			{
				
			}
		}
	}

}
