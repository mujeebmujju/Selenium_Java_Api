package Array_Practice_Program;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Print_Repetaed_Numbers_With_Position 
{
	 @Test
	 public void position1()
	 {
	 
	       int[] a={10,20,30,40,10,20,60,70,60, 30,10,20,10};
	       boolean[] b=new boolean[a.length];
	       for(int i=0;i<a.length;i++)
	       {
	           if(b[i]==false)
	           {
	               int count=0;
	               String repeat="";
	               for(int j=i+1;j<a.length;j++)
	               {
	                   if(a[i]==a[j])
	                   {
	                       count++;
	                       b[j]=true;
	                       repeat=repeat+(j+1)+",";
	                   }
	               }
	               if(count>0)
	               {
	                   System.out.println(a[i]+" is repeated at "+repeat+ " positions");
	               }
	           }
	       }
	    }
	

	    
	    //approach 2
  @Test
  public void position()
  {  
	  int []a= {1,1,3,1,3,4};
	  ArrayList<Object> list = new ArrayList<Object>();
	  for(int i=0; i<a.length; i++)
	  {
		  if(list.contains(a[i]))
		  {
			  System.out.println(a[i]+" is repeating at position "+(i+1));
		  }
		  else
		  {
			  list.add(a[i]);
		  }
	  }
  }
}








