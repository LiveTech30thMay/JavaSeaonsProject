package aug6th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		List al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al.size());
		
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		

		System.out.println(al.size());
		
		al.add(10.22);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add("LiveTech");
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println(al.contains(10.23));
		
	}

}
