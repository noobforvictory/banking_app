import java.util.Scanner;
import java.sql.*;
public class main {

	public static void main(String[] args) throws Exception{
		String url = "";
		String uname = "";
		String pass = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		BankAccount obj1 = new BankAccount("XYZ", "BA001");
		obj1.showMenu();

	}

}
