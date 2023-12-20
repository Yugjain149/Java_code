import java.util.Scanner;

public class Smax
{
	
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
				System.out.println("enter first number");
		int a = s.nextInt();
				System.out.println("enter second number");
		int b = s.nextInt();
				System.out.println("enter third number");
		int c = s.nextInt();
				System.out.println("enter fourth number");
		int d = s.nextInt();
		if((a>b) && (a>c) && (a>d))
		{
			System.out.println("a is greater"+a);
			if((b>d) && (b>c))
			{
				System.out.println("b is second greater"+b);
			}
			if((c>b) && (c>d))
			{
				System.out.println("c is second greater"+c);
			}
			if((d>b) && (d>c))
			{
				System.out.println("d is second greater"+d);
			}
		}
		
		if((b>a) && (b>c) && (b>d))
		{
			System.out.println("b is greater"+b);
			if((a>d) && (a>c))
			{
				System.out.println("a is second greater"+a);
			}
			if((c>a) && (c>d))
			{
				System.out.println("c is second greater"+c);
			}
			if((d>a) && (d>c))
			{
				System.out.println("d is second greater"+d);
			}
		}
		
		
		if((c>a) && (c>b) && (c>d))
		{
			System.out.println("c is greater"+c);
			if((a>d) && (a>b))
			{
				System.out.println("a is second greater"+a);
			}
			if((b>a) && (b>d))
			{
				System.out.println("b is second greater"+b);
			}
			if((d>a) && (d>b))
			{
				System.out.println("d is second greater"+d);
			}
		}
		
		
		if((d>a) && (d>c) && (d>b))
		{
			System.out.println("d is greater"+d);
			if((a>b) && (a>c))
			{
				System.out.println("a is second greater"+a);
			}
			if((c>a) && (c>b))
			{
				System.out.println("c is second greater"+c);
			}
			if((b>a) && (b>c))
			{
				System.out.println("b is second greater"+b);
			}
		}
	}
	
}