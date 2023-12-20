import java.util.Scanner;

class a
{
   void show1()
 {
	System.out.println("hello");
 }
}

class b extends a
{
	 void show2()
 {
	show1();
	super.show1();
 }
	public static void main(String k[])
{
   b e=new b();
   e.show2();
}

}