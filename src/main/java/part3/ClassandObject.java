package part3;

class Calculator{
	public int add(int n, int n2) {
		int r = n+n2;
		return r;
	}
}
public class ClassandObject {
	public static void main(String[] args) {
		
		Calculator ob = new Calculator();
		
//		System.out.println(ob.add(45, 90));
		int s= ob.add(234, 230);
		System.out.println(s);
	}
}
