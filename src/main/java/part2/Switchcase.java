package part2;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		
		//Switch Statement
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ()From 1 to7:   ");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;	
		default:
			System.out.println("Enter the number correctly");
			break;
		}
	}
}
