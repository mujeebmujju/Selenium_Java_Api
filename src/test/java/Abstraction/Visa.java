package Abstraction;

public class  Visa implements Country
{

	@Override
	public void usa() 
	{
		System.out.println("newyork");
	}

	@Override
	public void uk() 
	{
		System.out.println("Dubai");
	
	}  

	@Override
	public void canada() 
	{
		System.out.println("Saudi");

		
	}
	
	public void india()
	{
		System.out.println("Bangalore");
	}
	
}