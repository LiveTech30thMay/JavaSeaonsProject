package assignments3;

import java.util.Scanner;

public class SimpleInterstm1 {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		Scanner input=new Scanner(System.in);
		
		double p=input.nextDouble();
		double t=input.nextDouble();
		float r=input.nextFloat();
		
		double SI=(p*t*r)/100;
		
		System.out.println("Simple intrest is" +SI);
		}

}
