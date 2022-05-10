package org.ssglobal.training.codes.oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessConnection {

		private Connection conn;
		
		public void openConnection(String password, String url) {
			try {
				conn = DriverManager.getConnection(url, url, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
