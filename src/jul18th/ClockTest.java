package jul18th;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		
		Clock c1=new Clock();
		c1.setClock(9);
		c1.getClock();
		
		
		//user 2
		
		Clock c2=new Clock();
		c2.setClock(9, 18);
		c2.getClock();

	}

}
