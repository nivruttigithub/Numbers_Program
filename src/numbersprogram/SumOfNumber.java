package numbersprogram;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String args[]) {
		sum();
	}

	public static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range Of the Number to Sum : ");
		int no = sc.nextInt();
		sc.close();
		int s = 0;
		for (int i = 0; i <= no; i++) {
			s = s + i;
		}
		System.out.println("Sum Of All the Number upto " + no + " is " + s);
	}
}
