package aug5th;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		int[] a=new int[10];
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" \t");
		}
		
		System.out.println();
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		a[9]=100;
		a[10]=110;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" \t");
		}

	}

}
