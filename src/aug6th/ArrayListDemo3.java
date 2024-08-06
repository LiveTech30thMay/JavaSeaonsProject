package aug6th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		
		List<Integer> al=new ArrayList<Integer>();
		
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(Integer temp:al)
		{
			System.out.println(temp);
		}
		

	}

}
