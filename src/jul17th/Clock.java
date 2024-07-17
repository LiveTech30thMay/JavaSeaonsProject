package jul17th;

public class Clock {
	
	private int hr,min,sec;
	
	public void setClock(int a,int b,int c)
	{
		hr=a;
		min=b;
		sec=c;
	}
	
	public void getClock()
	{
		//System.out.println(hr+":"+min+":"+sec);
		System.out.printf("%02d:%02d:%02d",hr,min,sec);
		System.out.println();
	}

}
