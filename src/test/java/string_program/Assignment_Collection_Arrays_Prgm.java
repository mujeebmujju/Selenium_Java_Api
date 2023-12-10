package string_program;
import java.util.LinkedHashSet;
import org.testng.annotations.Test;
public class Assignment_Collection_Arrays_Prgm
{
	@Test
	public void RemoveRepeatedNumbersIngivenArrays() 
	{
		int a[]= {5,4,4,2,5,4,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);	
		}
		System.out.println("revome repeated numbers in the given array");
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
			System.out.println(num+"   "+count);
		}
	}
	
	@Test
	public void Uniquenumber() 
	{
		int a[]= {5,4,4,2,5,4,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);	
		}
		System.out.println("unique numbers");
		for (Integer num :set) {
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
				System.out.println(num+"   "+count);
			}
		}
	}
	
	@Test
	public void OnlyDuplicatesnumber() {
		int a[]= {5,4,4,2,5,4,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);	
		}
		System.out.println("Only Duplicates number");
		for (Integer num :set) {
			int count=0;
			for(int  i=0;i<a.length;i++) {
				if(num==a[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(num+"  "+count);
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
		System.out.println("Order of Each Number In the Array");
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
				System.out.println(num+"   "+count+" times");
			}
		}
	}
}