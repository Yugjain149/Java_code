import java.util.Scanner;

class one
{
 void show()
 {
	System.out.println("hello");

 }
}

class two extends one
{
 void show()
 {
	super.show();
	System.out.println("hello world"); 
 }

public static void main(String k[])
{
	two s=new two();
	s.show();
   
}

}