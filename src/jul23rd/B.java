package jul23rd;

public class B extends A{
	
	int x;
	
	public B()
	{
		super();
		System.out.println("B's constructor");
		
	}
	
	public void putX(int x)
	{
		this.x=x;
	}
	
	public void displayAll()
	{
		
		System.out.println(super.x);
		System.out.println(this.x);
		super.greet();
	}
	
	public void greet()
	{
		System.out.println("Hey..whazzup ??");
	}
	
	
	
	

}
