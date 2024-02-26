package Array_Practice_Program;

import org.testng.annotations.Test;

public class Addnum 
{
	public static void main(String[] args)
	{
		int[]a= {1,3,4,5,6,8,2,9,7,6,5,3,1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]+a[j]==10)
				{
					if(i>j)
					{
						break;
					}
					else
					{
						System.out.println(a[i]+","+a[j]);
					}
				}
			}
		}
	}
}



