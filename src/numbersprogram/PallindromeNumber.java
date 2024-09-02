package numbersprogram;

import java.util.Scanner;

public class PallindromeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check : ");
		int no = sc.nextInt();
		sc.close();
		int temp = no;
		int r;
		int result = 0;
		while (no > 0) {
			r = no % 10;
			result = result * 10 + r;
			no = no / 10;
		}
		if (result == temp) {
			System.out.println(temp + " is a Pallindrome Number..");
		} else {
			System.out.println(temp + " is Not a Pallindrome Number...!");

		}

	}
}
