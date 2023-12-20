import java.util.Scanner;

class inhe2
{
 void show1()
 {
	System.out.println("hello");

 }
}

class inhe3
{
 void show2()
 {
	System.out.println("hello world");

 
 }
}
class inhe4 extends inhe2,inhe3 
{
 void show3()
 {
	System.out.println("hello qwe");

 } 


public static void main(String k[])
{
	inhe4 s=new inhe4();
	s.show1();
	s.show2();
    s.show3();
}

}