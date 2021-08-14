package com.java4rohit.jdbc;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressSeervice {
	public static void main(String[] args) {
	}

	public List<Address> getAddress() {
		List<Address> addressList = null;

		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;

		try {
			connection = ConnectionManager.getConnection();
			statement = connection.createStatement();

			result = statement.executeQuery("SELECT * FROM address");
			addressList = new ArrayList<>();

			while (result.next()) {

				Address a1 = new Address(result.getString("HOUSE_NO"), result.getString("CITY"),
						result.getString("STATE"), result.getString("PIN_CODE"), result.getString("ID"));
				addressList.add(a1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(connection);
			ConnectionManager.closeStatement(statement);

		}

		return addressList;
	}
}
