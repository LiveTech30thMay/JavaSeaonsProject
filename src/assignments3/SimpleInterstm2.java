package assignments3;

import java.util.Scanner;

public class SimpleInterstm2 {

	public static void main(String[] args) {
		
		SimpleInterstm2 obj1=new SimpleInterstm2();
		obj1.simpleInterst();
		
	}
	
	    public void simpleInterst() {	
		System.out.println("Enter a Number");
		Scanner input=new Scanner(System.in);
		
		double p=input.nextDouble();
		double t=input.nextDouble();
		float r=input.nextFloat();
		
		double SI=(p*t*r)/100;
		
		System.out.println("Simple intrest is" +SI);
		}

}
