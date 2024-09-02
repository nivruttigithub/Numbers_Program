package numbersprogram;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Year to Check Whether LeapYear Or Not : ");
		int year = sc.nextInt();
		sc.close();
		boolean isLeap = (year % 4 == 0 || year % 100 == 0 || year % 400 == 0);

		if (isLeap) {
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is Not a Leap Year..");
		}
	}

}
