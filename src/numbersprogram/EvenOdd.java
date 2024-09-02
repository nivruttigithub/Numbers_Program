package numbersprogram;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		checkEvenOdd(0);
	}

	public static void checkEvenOdd(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int no = sc.nextInt();
		sc.close();
		if (no % 2 == 0) {
			System.out.println(no + " is Even Number..");
		} else {
			System.out.println(no + " is Odd Number");
		}
	}
}
