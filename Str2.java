import java.util.Scanner;

class Str2
{
public static void main(String arg[])
{
String s=new String("computer * qwe *  asd *zxc *fg");

String[] arr= s.split("*",0);
for(String w:arr){
	System.out.println(w);
}

} 
}