package numbersprogram;

import java.util.Scanner;

public class PowerOfNum {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Base Number : ");
	int num=sc.nextInt();
	System.out.println("Enter the Exponent of the Number : ");
	int exp = sc.nextInt();
//	double result = Math.pow(num, exp);
//	System.out.println(" Result is : "+result);
	double customresult = power(num,exp);
	System.out.println("Custom Result is : "+customresult);
	sc.close();
}
public static double power(int num,int exp)
{
	int r=1;
	for(int i=0;i<exp;i++)
	{
		r=r*num;
	}
	return r;
}
}
