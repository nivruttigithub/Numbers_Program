package numbersprogram;

import java.util.Scanner;

public class GreatestNum {
	public static void main(String args[]) {
		Greatest(0,0);
	}

	public static void Greatest(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Two Number to Check : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		if (n1 > n2) {
			System.out.println(n1 + " is Greatest Number..");
		} else if (n1 < n2) {
			System.out.println(n2 + " is Greatest Number..");
		} else {
			System.out.println(n1 + " and " + n2 + " Both are Same Number");
		}
	}
}
