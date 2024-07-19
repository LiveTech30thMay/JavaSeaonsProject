package jul19th;

public class Leave extends Marks{
	
	int sl,cl;
	
	public void setLeaves(int sl,int cl)
	{
		this.cl=cl;
		this.sl=sl;
	}
	
	public void getLeaves()
	{
		System.out.println("Total leaves taken "+(cl+sl));
	}
	
	public void getDetails()
	{
		System.out.println(rollNo+"---"+sNa);
	}

}
