import java.util.Scanner;

class a3
{
  int s=1000;
}

class b3 extends a3
{
	int s=2000;
	 void show1()
 {
	System.out.println("s="+super.s);
 	System.out.println("s="+s);
 }
	public static void main(String k[])
{
   b3 e=new b3();
   e.show1();
}

}