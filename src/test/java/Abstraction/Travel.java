package Abstraction;

public class Travel 
{
	public static void main(String[] args) 
	{
		Visa v = new Visa();
		v.usa();
		v.canada();
		v.uk();
		
		
		Country c=new Visa(); //type casting 
		c.canada();
		c.usa();
		c.uk();
		
		Visa n=(Visa) c;
		n.india();
		
	    
		
	}

}
