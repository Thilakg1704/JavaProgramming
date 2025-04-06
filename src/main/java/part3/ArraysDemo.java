package part3;

public class ArraysDemo {
	public static void main(String[] args) {
		
		int arr[] = new int [5];
		
		for(int i =0;i<5;i++) {
			
			arr[i] =  (int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		String a [] = {"LinkedIn","Naukri","Glassdoor"};
		
		for(String x:a) {
			System.out.println(x);
		}
	} 
}
