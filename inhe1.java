import java.util.Scanner;

class inhe
{
 void show1()
 {
	System.out.println("hello");

 }
}

class inhe1 extends inhe
{
 void show2()
 {
	System.out.println("hello world");

 }


public static void main(String k[])
{
	inhe1 s=new inhe1();
	s.show1();
	s.show2();
}

}