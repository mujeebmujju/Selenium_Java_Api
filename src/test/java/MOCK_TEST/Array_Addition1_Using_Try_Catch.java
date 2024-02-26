package MOCK_TEST;

public class Array_Addition1_Using_Try_Catch
{
	public static void main(String[] args) 
	{
		int[]a= {4,5,6,2,3};
		int[]b= {2,3,3,4};
		
		int length=a.length;
		
		if(a.length<b.length)
		{
			length=b.length;
		}
		
		for(int i=0; i<length; i++)
		{
			try
			{
				System.out.println(a[i]+b[i]);
			}
			
			catch (Exception e) 
			{
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				
				else
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
