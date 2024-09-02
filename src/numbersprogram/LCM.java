package numbersprogram;

public class LCM {
public static void main(String args[])
{
	int a=48;
	int b=18;
	int lcm=findLcm(a,b);
	System.out.println("Lcm Of "+a+" and "+b+" is : "+lcm);
}
public static int findLcm(int a,int b)
{
	return (a*b)/findHcf(a,b);
}
public static int findHcf(int a,int b)
{
	while(b!=0)
	{
		int temp=b;
		b=a%b;
		a=temp;
	}
	return a;
}
}
