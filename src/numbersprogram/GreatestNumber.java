package numbersprogram;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String args[]) {
		greatestFromThree(0, 0, 0);

	}

	public static void greatestFromThree(int num1, int num2, int num3) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Number to Check : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		int a = n1 > n2 ? n1 : n2;
		int b = n2 > n3 ? n2 : n3;

		if (a > b) {
			System.out.println(a + " is Greatest Number");
		} else if (a < b) {
			System.out.println(b + " is Greatest Number");
		} else {
			System.out.println(" All Three Numbers are Equal ....");
		}
	}
}
