package com.login.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = "springstudent";
		String passWord = "springstudent";
		String jdbcURL = "jdbc:mysql://localhost:3306/log_in_form?useSSL=false&serverTimezone=UTC";

		String driver = "com.mysql.cj.jdbc.Driver";

		try {

			PrintWriter writer = response.getWriter();

			writer.println("Connecting to datbase" + jdbcURL);

			Class.forName(driver);

			Connection connection = DriverManager.getConnection(jdbcURL, userName, passWord);

			writer.println("Scuccess!!");

			connection.close();

		} catch (Exception ex) {

			ex.printStackTrace();

			throw new ServletException(ex);
		}

	}

}
