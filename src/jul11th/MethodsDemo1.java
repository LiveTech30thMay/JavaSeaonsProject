package jul11th;

import java.util.Scanner;

public class MethodsDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter a natural number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		int res=n*(n+1)/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
		
		System.out.println("Enter a natural number ");
		Scanner input2=new Scanner(System.in);
		int n2=input2.nextInt();
		
		int res2=n2*(n2+1)/2;
		
		System.out.println("Sum of "+n2+" natural numbers is "+res2);
		
		
		
	}

}
