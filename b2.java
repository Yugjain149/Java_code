import java.util.Scanner;

final class a
{
   void show()
 {
	System.out.println("hello");
 }
}

class b extends a
{
	 void show1()
 {
	System.out.println("hello world");
 }
	public static void main(String k[])
{
   b e=new b();
   e.show1();
}

}