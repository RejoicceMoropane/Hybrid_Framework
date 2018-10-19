package Reuse;

import java.sql.Statement;
import java.util.ArrayList;

import net.sourceforge.htmlunit.corejs.javascript.ast.CatchClause;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DB_Script {
	
	

	public void addAplicantdetails(ArrayList<String> applicantData) throws ClassNotFoundException, SQLException {

		//insert applicant details into database
		String sql = "insert into applicant_details(Name, Email, Phone) " +
		        "VALUES (?, ?, ?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Open a connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testautomation?autoReconnect=true&useSSL=false", "root", "123@tst");
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		preparedStatement.setString(1, applicantData.get(0));
		preparedStatement.setString(2, applicantData.get(1));
		preparedStatement.setString(3,applicantData.get(2));
		preparedStatement.executeUpdate(); 
		
	}
	public void getApplicantDetails() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		// Open a connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testautomation?autoReconnect=true&useSSL=false", "root", "123@tst");
		
	    if (conn != null) {
           System.out.println("Connected to the Database...");
        }else {
        	System.out.println("Cannot connect to Database...");
        }
		
		Statement stmt = conn.createStatement();
		ResultSet resultSet = null;
		resultSet = stmt.executeQuery("Select * From applicant_details");
	
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("Name"));
		
		}
		
	
		
	}
	

}

