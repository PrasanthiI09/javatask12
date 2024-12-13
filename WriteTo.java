package InsertToJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class WriteTo {
	public static void main(String[] args) {

		Connection connection = null;
		try {
			String dbUrl = "jdbc:sqlite:C:\\Users\\prabh\\Desktop\\javatask12.db";
			connection = DriverManager.getConnection(dbUrl);

			System.out.println("Connection to SQLite has been established.");

			Statement statement = connection.createStatement();

			String query = "CREATE TABLE Employee (\r\n" + "  empcode INTEGER PRIMARY KEY,\r\n"
					+ "  empname TEXT NOT NULL,\r\n" + "  epmage INTEGER, \r\n" + "  esalary REAL NOT NULL\r\n" + ");";

			statement.execute(query);

			query = "INSERT INTO Employee VALUES (101, 'Jenny', 25,10000);";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES (102, 'Jacky', 30, 20000);";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES (103, 'Joe', 20, 40000);";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES (104, 'John', 40,80000);";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES (105, 'Shameer', 25, 90000);";
			statement.executeUpdate(query);
			System.out.println("All 5 rows have been inserted");

			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
