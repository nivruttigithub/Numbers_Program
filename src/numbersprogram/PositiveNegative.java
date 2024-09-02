package numbersprogram;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		checkNumber(0);
	}
public static void checkNumber(int num)
{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check : ");
		int no = sc.nextInt();
		sc.close();
		if (no > 0) {
			System.out.println(no + " is a Positive Number");
		} else if (no < 0) {
			System.out.println(no + " is a Negative Number");
		} else {
			System.out.println(no + " is Zero");
		}
	}

}
