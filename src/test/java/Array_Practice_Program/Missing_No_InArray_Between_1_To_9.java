package Array_Practice_Program;

import org.testng.annotations.Test;

public class Missing_No_InArray_Between_1_To_9
{
	@Test
	public void Missing()
	{
		int[]a= {1,3,6,7,9};

			for (int i = 1; i <=9; i++) 
			{
				int count = 0;
				for (int j = 0; j < a.length; j++) 
				{
					if (a[j] == i) 
					{
						count = 1;
						break;
					}

				}
				if (count == 0) 
				{
					System.out.println(i);
				}

			}
	}
}

		