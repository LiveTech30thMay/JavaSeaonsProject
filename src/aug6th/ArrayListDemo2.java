package aug6th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		List<String> al=new ArrayList<String>();
		
		System.out.println();
		al.add("Hi");
		al.add("Welcome");
		al.add("selenium");
		al.add("java");
		//al.add(10);
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(String temp:al)
		{
			System.out.println(temp);
		}
		

	}

}
