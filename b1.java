import java.util.Scanner;

class a
{
  final void show1()
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