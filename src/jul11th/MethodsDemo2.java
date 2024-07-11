package jul11th;

import java.util.Scanner;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		MethodsDemo2 obj1=new MethodsDemo2();
		obj1.sumOfNaturalNumbers();
		obj1.sumOfNaturalNumbers();
		
	}
	
	public void sumOfNaturalNumbers()
	{
		System.out.println("Enter a natural number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		int res=n*(n+1)/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
	}
	

}
