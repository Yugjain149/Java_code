import java.util.Scanner;

class Inputarray
{
  public static void main(String g[])
  {
   int arr[]=new int[5];
   int i;
   Scanner sc=new Scanner(System.in);
       for(i=0;i<5;i++)
	   {
	    System.out.println("enter number");
		arr[i]=sc.nextInt();
	   }
	   System.out.println("output is");
	   for(i=0;i<5;i++)
	   {
	   System.out.print("\t"+arr[i]);
	   }
	      System.out.println("\n reverse=");
	
	   for(i=4;i>=0;i--)
	   {
	   System.out.print("\t"+arr[i]);
		   
	   }
	//   for(int ee:arr)
	  // {
	   //System.out.println(ee);
	   //}
  }
}