package jul27th;

import java.util.Scanner;

public class TernaryOperatorDemo1 {

	public static void main(String[] args) {
		System.out.println("Enter some integer value ");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		//System.out.println(x>=0?"+ve":"-ve");
		
		if(x>0)
		{
			System.out.println("+ve");
		}
		else
		{
			System.out.println("-ve");
		}
		

	}

}
