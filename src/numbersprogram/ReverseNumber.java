package numbersprogram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Reverse : ");
		int no = sc.nextInt();
		sc.close();

		int result = 0;
		int r;
		while (no > 0) {
			r = no % 10;
			result = result * 10 + r;
			no = no / 10;
		}
		System.out.println(result);
	}
}
