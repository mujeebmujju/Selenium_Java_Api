package Array_Practice_Program;

import org.testng.annotations.Test;

public class First_MinimumNoArray_WithoutusingBuublesort 
{
	@Test
	public void Minimum()
	{
		int[]a= {2,5,6,8,1};
		int min=a[0];
		
		for(int i=0; i<a.length;i++)
			
//			i=0  0<5 t  a[i]=5
//			i=1  1<5 t      =3
//			i=2  2<5 t      =2
//			i=3  3<5 t      =0
//			i=4  4<5 t      =1
//			i=5  5<5 f terminate
		{
			if(min>a[i]) 
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
