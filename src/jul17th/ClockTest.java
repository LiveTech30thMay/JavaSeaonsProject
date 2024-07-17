package jul17th;

public class ClockTest {

	public static void main(String[] args) {
		
		Clock c1=new Clock();
		c1.getClock();    // 0:0:0
		c1.setClock(10, 2, 55);
		c1.getClock();  //9:12:55

	}

}
