import java.util.Scanner;

class bike
{
	int a;
	int b;
	void input()
	{
		a=10;
		b=10;
	}
	
	void input(int x)
	{
		a=x;
		b=x;
	}
	void input(int x,int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println("="+a);
	     System.out.println("="+b);
	
	}
    
	public static void main (String k[])
	{
		
       bike s=new bike();
	   s.input();
	   s.show();
	   s.input(20);
	   s.show();
	   s.input(200,300);
	   s.show();
	   
	}  
}