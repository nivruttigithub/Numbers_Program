package numbersprogram;

import java.util.Scanner;

public class SumOfNumberWithRange {
	public static void main(String args[]) {
		sumNumber();

	}

	public static void sumNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Number : ");
		int startNo = sc.nextInt();
		System.out.println(" Enter the Last Number : ");
		int lastNo = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = startNo; i <= lastNo; i++) {
			sum = sum + i;
		}
		System.out.println(" Sum Of All the Number from " + startNo + " to " + lastNo + " is : " + sum);
	}
}
