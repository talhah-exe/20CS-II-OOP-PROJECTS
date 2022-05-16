import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;

public class DB {
	Connection con = null;
	java.sql.PreparedStatement pst;
	public static Connection dbconnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance","root","");
			return con;
		}
		catch (Exception e2)
		{
			System.out.print(e2);
			return null;
		}
		
	}

}
