package jul19th;

public class Marks extends Student{
	
	int m1,m2,m3;
	
	public void setMarks(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public void getMarks()
	{
		System.out.println("Total : "+ (m1+m2+m3));
	}

}
