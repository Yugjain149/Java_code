import java.util.Scanner;
import java.util.*;
import java.lang.StringBuffer;

public class my

{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter your String = ");
		String str = s.nextLine();
		StringBuffer r = new StringBuffer(str);
		System.out.println("reverse = "+r.reverse());
	}
}