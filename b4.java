import java.util.Scanner;

class a4
{
 void show1()
 {
	 System.out.println("hello");
 }
}

class b4 extends a4
{

	 void show1()
 {
	System.out.println("Hello World");
    super.show1(); 	
 }
	public static void main(String k[])
{
   b4 e=new b4();
   e.show1();
}

}