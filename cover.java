import java.util.Scanner;

class cover
{
	int a;
	int b;
	cover()
	{
		a=10;
		b=10;
	}
	
	cover(int x)
	{
		a=x;
		b=x;
	}
	cover(int x,int y)
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
		
       cover s=new cover();
	   cover d=new cover(20);
	   cover f=new cover(11,22);
	   
	   s.show();
	   d.show();
	   f.show();
	   
	   
	}  
}