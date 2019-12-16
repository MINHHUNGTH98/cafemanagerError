package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.Connect;

public class LoginController {
	public static boolean checkAccount(String txtAccount, String txtPassword) throws SQLException {
		Statement statement = Connect.getConnection().createStatement();
		String sql = "select * from account where UserName = \'" + txtAccount + "\' and PassWord = \'" + txtPassword + "\'";
		ResultSet resultSet = statement.executeQuery(sql);
		try {
			if (resultSet.next()) return true;
		} finally {
			Connect.close();
		}
		return false;
	}
}
