import java.util.Scanner;

class Arraye
{
     public static void main (String k[])
  {
       Scanner sc=new Scanner(System.in);
	   int a[]=new int[5];
	   int i;
	   for(i=0;i<5;i++)
	   {
	      System.out.println("enter no=");
		  a[i]=sc.nextInt();
	   }
	      
		  System.out.println("output=");
		 
	   for(i=0;i<5;i++)
	   {
	      System.out.println("\t="+a[i]);
	   }
	   
  }  
}