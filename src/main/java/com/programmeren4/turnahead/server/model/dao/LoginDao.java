package com.programmeren4.turnahead.server.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.programmeren4.turnahead.server.database.DBConnector;
import com.programmeren4.turnahead.shared.dto.LoginDTO;
import com.programmeren4.turnahead.shared.exception.DAOException;

public class LoginDao {
	private Connection conn;
	private String sql;

	public LoginDao() {

	}

	public LoginDTO checkLogin(LoginDTO login) throws DAOException {

		LoginDTO LoginReturn = null;
		ResultSet rs = null;
		try {
//			Class.forName(DBConnector.DRIVER_CLASS).newInstance();
//			this.conn = DBConnector.getInstance().getConn();
//			String sql = "SELECT * FROM USER";// WHERE EMAIL=" + login.getEMail();
//			rs = conn.createStatement().executeQuery(sql);
//			if (rs.next()) {
//				LoginReturn = new LoginDTO();
//				LoginReturn.setEMail(rs.getString("EMAIL"));
//				LoginReturn.setPassword(rs.getString("PASSWORD"));
//			}
//		} catch (SQLException se) {
//			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			DBConnector.getInstance().close(rs);
//			DBConnector.getInstance().closeConn();
		}

		return LoginReturn;
	}
}
