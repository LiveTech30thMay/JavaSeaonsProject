package jul11th;

import java.util.Scanner;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3 obj1=new MethodsDemo3();
		System.out.println("Enter a natural number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sumRes=obj1.sumOfNaturalNumbers(n);
		System.out.println("Sum of "+n+" natural numbers is "+sumRes);
				
	}
	
	public int  sumOfNaturalNumbers(int n)
	{
		
		int res=n*(n+1)/2;
		
		return res;
		
	}
	

}
