package com.java4rohit.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

	public List<Student> getStudents() {
		List<Student> list = null;


		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;

		try {
			connection = ConnectionManager.getConnection();

			statement = connection.createStatement();

			result = statement.executeQuery("SELECT * FROM studnet");
			list = new ArrayList<Student>();
			while (result.next()) {

				Student s1 = new Student(result.getString("NAME"),
						result.getString("RollNO"),
						result.getString("Branch"),
						result.getString("address"));
				list.add(s1);
				
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(connection);
			ConnectionManager.closeStatement(statement);

		}

	
		return list;
	}
}
