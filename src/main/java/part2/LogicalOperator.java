package part2;

public class LogicalOperator {
	public static void main(String args[]) {
		
		//Logical Operator
		int x = 456;
		int y =8765;
		int a =567;
		int b =7654;
		//AND
		boolean result = x>y && a<b;
		System.out.println(result );
		boolean result1 = x>y || a<b;
		System.out.println(result1);
		boolean result3 = !(x>y);
		System.out.println(result3);
		
	}
}
