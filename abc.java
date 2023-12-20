import java.util.Scanner;

class abc
{
	int a;
	void input()
	{
		a=100;
	}
	void input(int x)
	{
		a=x;
	}
	void show()
	{
		System.out.println(a);
	}
     public static void main (String k[])
	{
		
       abc s=new abc();
	   s.input();
	   s.show();
	   s.input(500);
	   s.show();
	   
	}  
}