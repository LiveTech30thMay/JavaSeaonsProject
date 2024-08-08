package aug7th;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws ArithmeticException{
		
		System.out.println("Enter x value : ");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("Enter y value : ");
		
		int y=input.nextInt();
		
		try
		{
		int z=x/y;
		
		System.out.println("Quotient is "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Please Enter non-zero value for y..");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime excpetion occure ..");
		}
		
		finally
		{
			System.out.println("finally blocked executed ...");
		}
		
		
		System.out.println("End of program...");

	}

}
