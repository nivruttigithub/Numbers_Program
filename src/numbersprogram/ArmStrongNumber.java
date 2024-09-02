package numbersprogram;

import java.util.Scanner;

//ArmStrong Number is Number Which is Equal to Sum Of the Cube Of their Digits
public class ArmStrongNumber {
	public static void checkArmStrong(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check : ");
		int no = sc.nextInt();
		sc.close();
		int r;

		int result = 0;
		int temp = no;
		while (no > 0) {
			r = no % 10;
			result = result + r * r * r;
			no = no / 10;
		}
		if (temp == result) {
			System.out.println(temp + " is a ArmStrong Number..");
		} else {
			System.out.println(temp + " is Not a ArmStrong Number...!");
		}

	}

	public static void main(String args[]) {
		checkArmStrong(153);
	}
}
