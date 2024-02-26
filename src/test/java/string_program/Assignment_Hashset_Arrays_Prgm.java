package string_program;
import java.util.LinkedHashSet;
import org.testng.annotations.Test;
public class Assignment_Hashset_Arrays_Prgm
{

	@Test
	public void RemoveRepeatedNumbers_OR_Uniquenumber() 
	{
		int a[]= {5,4,4,2,5,4,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);	
		}
		System.out.println("unique numbers");
		for (Integer num :set)
		{
			int count=0;
			for(int  i=0;i<a.length;i++) 
			{
				if(num==a[i]) 
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(num+"="+count);
			}
		}
	}
	
	@Test
	public void OnlyDuplicatesnumber() {
		int a[]= {5,4,4,2,5,4,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);	
		}
		System.out.println("Only Duplicates number");
		for (Integer num :set) 
		{
			int count=0;
			for(int  i=0;i<a.length;i++) 
			{
				if(num==a[i]) 
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(num+"="+count);
			}
		}
	}
	
	@Test
	public void OrderofEachNumberInArray() 
	{
		int a[]= {5,4,4,2,5,4,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);	
		}
		System.out.println("Occurance of Each Number In the Array");
		for (Integer num :set) 
		{
			int count=0;
			for(int  i=0;i<a.length;i++) 
			{
				if(num==a[i]) 
				{
					count++;
				}
			}
			if(count>=1) 
			{
				System.out.println(num+"="+count+" times");
			}
		}
	}
}