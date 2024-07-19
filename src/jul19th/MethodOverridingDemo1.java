package jul19th;

public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		
		//case 1 
		
		//P obj=new P();
		
		//Case 2
		
		//C obj=new C();
		
		//case 3
		
		//C obj=new P();
		
		//case 4
		
		P obj=new C();
		
		System.out.println(obj.x); 
		obj.m1();  
		
		

	}

}
