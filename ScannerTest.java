import java.util.Scanner;
class ScannerTest

{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your rollno");
		int rollno = sc.nextInt();
	    System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter your fee");
		double fee = sc.nextDouble();
		System.out.println("Rollno:"+rollno+"\n"+"Name:"+name+"\n"+"Fee:"+fee);
	}
}