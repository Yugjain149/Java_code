import java.util.Scanner;

class over
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
		System.out.println("a="+a);
	     System.out.println("b="+b);
	
	}
    
	public static void main (String k[])
	{
		
       over s=new over();
	   over d=new over();
	   over f=new over();
	   s.input();
	   s.show();
	   d.input(20);
	   d.show();
	   f.input(11,22);
	   f.show();
	   
	   
	}  
}