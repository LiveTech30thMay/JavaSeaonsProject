package aug6th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.size());
		
		hs.add("Hi");
		hs.add("Welcome");
		hs.add("selenium");
		hs.add("java");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		hs.add("Hi");
		hs.add("Welcome");
		hs.add("selenium");
		hs.add("java");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
