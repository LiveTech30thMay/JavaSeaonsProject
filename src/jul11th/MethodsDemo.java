package jul11th;

import java.util.Scanner;

public class MethodsDemo {

	public static void main(String[] args) {
		
		Utils obj1=new Utils();
		obj1.greet();
		Scanner input=new Scanner(System.in);
		int res=obj1.naturalSum(input.nextInt());
		System.out.println(res);

	}

}
