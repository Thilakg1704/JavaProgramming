package part2;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		//Arithmetic Operator 
		
		int num =10;
		int num2 =5;
		System.out.println("number 1: "+num+"\nnumber 2: "+num2);
		System.out.println("-----------------------");
		System.out.println("Addition: "+(num+num2));
		System.out.println("Subtraction: "+(num-num2));
		System.out.println("Division: "+(num/num2));
		System.out.println("Multiplication: "+(num*num2));
		System.out.println("Module: "+(num%num2));
		System.out.println("-=--==-=--=-=-=-=-=-=-=");
		//pre-increment
		
		int a = 10;
		System.out.println("Value of a: "+a);
		int result = ++a;
		result = a++;
		System.out.println(result);
		System.out.println(a);
		
	}
}
