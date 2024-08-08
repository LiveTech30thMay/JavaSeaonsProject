package aug8th;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args)  {
		
		try {
			new FileInputStream("D:\\010LivetechWS\\JavaSeasons\\file1.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println("Make sure you have file before use ..");
		}
		
		System.out.println("End of program..");
		

	}

}
