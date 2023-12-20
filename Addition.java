
import java.util.Scanner;

class Addition
{
    public static void main (String args[])
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("enter your no1");
		int a = sc.nextInt();
	    System.out.println("enter your no2");
		int b = sc.nextInt();
		int c=a+b;
		System.out.println("total="+c);
		
	}
}