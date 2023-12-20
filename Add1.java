import java.util.Scanner;

public class HCF
{
	puiblic static void main (String []args)
	{
		Scanner s= new Scanner( System.in );
		System.out.println("enter two number");
		int a=s.nextInt();
		int b=s.nextInt();
		int z=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				z=i;
			}
		}			
			System.out.println("hcf of"+a+b+"="+z);
	}
}