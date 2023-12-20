import java.util.Scanner;

class inhe1
{
 void show1()
 {
	System.out.println("hello");

 }
}

class inhe2 extends inhe1
{
 void show2()
 {
	System.out.println("hello world");

 
 }
}
class inhe3 extends inhe1
{
 void show3()
 {
	System.out.println("hello qwe");

 } 


public static void main(String k[])
{
	inhe3 s=new inhe3();
	inhe2 r=new inhe2();
	r.show2();
	r.show1();
	s.show1();
    s.show3();
}

}