import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://database-1.c5k6coggm21l.ap-south-1.rds.amazonaws.com:3306/sonoo?characterEncoding=utf8","admin","Login#12345");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
//ResultSet rs=stmt.executeQuery("select * from emp");
ResultSet rs=stmt.executeQuery("select * from emp where id = 3");

while(rs.next())  
	 System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  