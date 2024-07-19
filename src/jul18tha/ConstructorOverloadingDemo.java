package jul18tha;

public class ConstructorOverloadingDemo {
	
	public static void main(String[] args) {
		
		//user 1
		
		//Clock c1=new Clock();
		//c1.getClock();
		new Clock().getClock();
		
		//user 2
		
		new Clock(9).getClock();
		
		//user 3
		
		new Clock(9,55).getClock();
		
		//user 4
		
		new Clock(9,55,56).getClock();;
		
	}

}
