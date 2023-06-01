import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCdemoconnect {

	public static void main(String[] args) throws SQLException {
		
//		create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
//		create a stament and queary
		Statement st=con.createStatement();
		
		String s="select name,mark from library;";
//		Execute the Queary using statement
		ResultSet rs=st.executeQuery(s);
		
		//going through the stores result
		while(rs.next()) {
			int marks=rs.getInt("mark");
			String sname=rs.getString("name");
			System.out.println(marks+" "+sname);
		}
		
//		close connection
		con.close();
		
		System.out.println("Queary Executed");

	}

}
