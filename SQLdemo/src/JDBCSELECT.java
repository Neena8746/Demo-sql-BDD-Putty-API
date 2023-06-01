import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCSELECT {

	public static void main(String[] args) throws SQLException {
		




//		create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
//		create a stament and queary
		Statement st=con.createStatement();
		
		String s="insert into library values(4,'Josmi',19);";
//		Execute the Queary using statement
		st.execute(s);
		
//		close connection
		con.close();
		
		System.out.println("Queary Executed");

	}

}
