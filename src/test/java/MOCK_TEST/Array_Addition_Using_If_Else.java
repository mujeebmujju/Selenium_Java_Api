package MOCK_TEST;

public class Array_Addition_Using_If_Else
{
	public static void main(String[] args) 
	{
		int[]a= {1,2,3};
		int[]b= {2,4,6,8};
		
		int[] l;   
		int[] s;
		
		if(a.length > b.length)
		{
			l=a;
			s=b;
		}
		else
		{
			
			l=b;
			s=a;
		}
		
		for(int i=0; i< s.length; i++)
		{
			System.out.println(l[i]+s[i] + " ");
		}
		
		for(int i=s.length; i<l.length; i++)
		{
			System.out.println(l[i] + " ");
		}
		
	}

}
