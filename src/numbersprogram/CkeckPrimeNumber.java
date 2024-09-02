package numbersprogram;

import java.util.Scanner;

public class CkeckPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check : ");
		int no = sc.nextInt();
		sc.close();
		boolean isPrime = true;

		for (int i = 2; i <= no / 2; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(no + " is a Prime Number..");
		} else {
			System.out.println(no + " is Not a Prime Number");
		}
	}

}
