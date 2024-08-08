package aug8th;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) throws ArithmeticException {
		
		System.out.println("Enter x value : ");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("Enter y value : ");
		
		int y=input.nextInt();
		
		int z=x/y;
		
		System.out.println("Quotient is "+z);
		
		System.out.println("End of program..");
		
		

	}

}
