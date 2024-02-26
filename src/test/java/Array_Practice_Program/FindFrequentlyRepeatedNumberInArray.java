// Find the Frequently Repeated Number In Array

package Array_Practice_Program;

import org.testng.annotations.Test;

public class FindFrequentlyRepeatedNumberInArray 
{
	@Test
	public void frequentlyRepeated()
	{
		int[]a= {1,2,4,2,6,2,8,10,2};
		int max=0;
		int value=0;    

		for(int i=0; i<a.length; i++)
		{
			int count=1;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count>max)
			{
				max=count;
				value=a[i];
			}
			
			
		}
		System.out.println(value +" is repeating "+max +" times");
	}

}
