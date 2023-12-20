import java.util.Scanner;

class a
{
    int z=100;
}

interface b
{
	int x=200;
}

class c extends a implements b
{
	int s=z+x;
	void show()
	{
		System.out.println(""+s);
	}
	public static void main(String k[])

{
   c e=new c();
   e.show();
}

}