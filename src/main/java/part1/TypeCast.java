package part1;

public class TypeCast {
	public static void main(String[] args) {
		
		//Type cast 
		//implicit
		
		int a =10;
		System.out.println("Initial Value of a: "+a );
		byte b =30;
		a =b;
		System.out.println("Implicitly TypeCasted  Value of a: "+a );
		//Explicit
		System.out.println("******************************");
		int num = 40;
		byte by = 50;
		System.out.println("Initial Value of by: "+by );
		
		by = (byte)num;
		System.out.println("Explicit  Value of by: "+by );
		
	}
}
