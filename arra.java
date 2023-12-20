import java.util.Scanner;

public class  arra
{
	public static void main(String []args)
	{
		 Scanner s = new Scanner(System.in);
		 int a[] = new int[5];
		 int i;
		 for(i=0;i<5;i++)
		 {
			 System.out.println("entr no= ");
			 a[i] = s.nextInt();
		 }
			 System.out.println("output =");
			 
	     for(i=0;i<5;i++)
		 {
			 System.out.println(" no= "+a[i]);
		 }
		 System.out.println("enter seaRCH no=");
		 int n = s.nextInt();
		 
		 int count=0;
	     for(i=0;i<5;i++)
		 {
				if(a[i]==n)
				{
					count++;
				}
		 }
		 if(count>0)
		 {
			 System.out.println(" no of times item found =  "+count);
		 }
		 else
		 {
			 System.out.println(" not found" );
		 }
	}
}