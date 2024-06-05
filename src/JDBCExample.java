import java.sql.*;   // import package
public class JDBCExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// load the driver
		Class.forName("com.mysql.jdbc.Driver");
		// create connection  -- "URL","UserName","PASSWARD"
		Connection con = DriverManager.getConnection("jdbc:mysql://database-1.c5k6coggm21l.ap-south-1.rds.amazonaws.com:3306/student","admin","Login#12345");
		// create query
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from Student");
		// Process the data
		rs.next();
		
		int roll_no = rs.getInt("Roll no");
		String st_name = rs.getString("Name");
		String st_city = rs.getString("City");
		System.out.print(roll_no+" "+st_name+" "+st_city);
		//close the connection 
		st.close();
		con.close();
	}

}
