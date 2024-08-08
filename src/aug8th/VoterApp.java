package aug8th;

import java.util.Scanner;

public class VoterApp {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to voter registration system.. ");
		
		System.out.println("Enter your Age : ");
		
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
		
		if(age>=18)
		{
			System.out.println("Elgible for Voting ..please proceed ..");
		}
		else
		{
			//System.out.println("Not elegible for voting ..");
			
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.println("End of program...");
		
	}

}
