package assignments3;

import java.util.Scanner;

public class SimpleInterstm3 {

	public static void main(String[] args) {
		
		SimpleInterstm3 obj1=new SimpleInterstm3();
		System.out.println("Enter a Number");
		Scanner input=new Scanner(System.in);
		
		double p=input.nextDouble();
		double t=input.nextDouble();
		float r=input.nextFloat();
		obj1.simpleInterst(p,t,r);
		double res=obj1.simpleInterst(p, t, r);
		System.out.println("Simple intrest is" +res);
		
	}
	
	    public double simpleInterst(double p, double t, float r) {	
		
		
		double SI=(p*t*r)/100;
		
		
		return SI;
		}

}
