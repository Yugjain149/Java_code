import java.util.Scanner;

class qwe
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your rollno");
		int rollno=sc.nextInt();
	    System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your fee");
		double fee=sc.nextDouble();
		System.out.println("\n\t"+"Rollno:"+rollno+"\n\t"+"Name:"+name+"\n\t"+"Fee:"+fee);
	}
}