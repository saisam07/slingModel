package com.mindtree.capability.core.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoSlingUtility {
	private static final String URL = "jdbc:mysql://localhost:3306/WORLD";
	private static final String USER = "root";
	private static final String PASSWORD = "sridhar1998";
	private static Connection con;

	// -------------------------Getting Connection----------------------------------
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return con;
	}

	// --------------------------Closing Connection------------------------------
	public static void closeConnection(Connection con){
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
