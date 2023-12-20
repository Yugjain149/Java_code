import java.util.Scanner;

public class Smax
{
	
	public static void main(String []args)
	{
		Scanner p = new Scanner(System.in);
				system.out.println("enter first number");
		int a=s.nextInt();
				system.out.println("enter second number");
		int b=s.nextInt();
				system.out.println("enter third number");
		int c=s.nextInt();
				system.out.println("enter fourth number");
		int d=s.nextInt();
		if((a>b) && (a>c) && (a>d))
		{
			system.out.println("a is greater"+a);
			if((b>d) && (b>c))
			{
				system.out.println("b is second greater"+b);
			}
			if((c>b) && (c>d))
			{
				system.out.println("c is second greater"+c);
			}
			if((d>b) && (d>c))
			{
				system.out.println("d is second greater"+d);
			}
		}
		
		if((b>a) && (b>c) && (b>d))
		{
			system.out.println("b is greater"+b);
			if((a>d) && (a>c))
			{
				system.out.println("a is second greater"+a);
			}
			if((c>a) && (c>d))
			{
				ystem.out.println("c is second greater"+c);
			}
			if((d>a) && (d>c))
			{
				system.out.println("d is second greater"+d);
			}
		}
	}
	
}