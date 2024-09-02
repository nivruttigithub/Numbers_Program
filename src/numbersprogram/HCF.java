package numbersprogram;

import java.util.Scanner;

public class HCF {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		int hcf = findHCF(a, b);
		System.out.println("HCF OF " + a + " and " + b + " are : " + hcf);
		sc.close();
	}

	public static int findHCF(int a, int b) {
		while (b != 0) {

			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
}
