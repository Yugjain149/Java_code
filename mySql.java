import java.sql.*;  
class mySql{  
public static void main(String args[]){  
try
{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yug?characterEncoding=latin1","root","1234");  
//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	int rs=stmt.executeUpdate("insert into school(rollno,name,m1,m2) values ('121','poiuyt','25','45')");  
	if(rs>0)
	{
		System.out.println("successful");
	}
	else
	{
		System.out.println(" not successful");
	}
	con.close();  
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}  
}  //https://www.javatpoint.com/socket-programming