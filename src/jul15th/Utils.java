package jul15th;

import java.util.Scanner;

public class Utils {

	public static void greet()
	{
		System.out.println("Hi ..good morning ...");
	}
	
	
	//model 1  (no return type and no parameters)
	public static void natSum1()
	{
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		int res=n*(n+1)/2;
		
		System.out.println(res);
		
	}
	
	//model 2  (no return type and with parameters)
	
	public static void natSum2(int n)
	{
		
		int res=n*(n+1)/2;
		
		System.out.println(res);
		
	}
	
	//model 3  ( return type and without parameters)
	
	public static int natSum3()
	{
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		int res=n*(n+1)/2;
		
		return res;
	}
	
	//model 4  ( return type and with parameters)
	
	public static int natSum4(int n)
	{
		int res=n*(n+1)/2;
		
		return res;
	}
}
