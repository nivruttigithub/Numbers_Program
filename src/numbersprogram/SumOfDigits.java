package numbersprogram;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number ");
	int no=sc.nextInt();
	sc.close();
	int sum=0;
	while(no!=0)
	{
		int r=no%10;
		sum=sum+r;
		no=no/10;
	}
	System.out.println("Sum Of All the digits in Given Number is : "+sum);
}
}
