package numbersprogram;

public class PrimeFactor {
public static void main(String args[])
{
	int no = 20;
	System.out.print("Prime Factor Of "+no+" is : ");
	
	while(no%2==0)
	{
		System.out.print(2+" ");
		no=no/2;
	}
	for(int i=3;i*i<=no;i=i+2)
	{
		System.out.print(i+" ");
		no=no/i;
	}
	if(no>2)
	{
		System.out.print(no);
	}
}
}
