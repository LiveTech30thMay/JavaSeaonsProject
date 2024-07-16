package assignments3;

import java.util.Scanner;

public class SimpleIntrestm0 {

	public static void main(String[] args) {
		
		Interst obj1=new Interst();
		obj1.message();
		Scanner input=new Scanner(System.in);
		
		//int p=input.nextInt();
		//int t=input.nextInt();
		//int r=input.nextInt();
		
		double SI=obj1.simpleInterst(input.nextDouble(), input.nextDouble(), input.nextFloat());
		System.out.println(SI);
	}

}
