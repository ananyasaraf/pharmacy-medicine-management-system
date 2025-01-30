package com.example.pharmacymanagementsystem.util;
import com.example.pharmacymanagementsystem.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void closeConnection() {
    }

    public void getAllEmployees() throws SQLException {
    String query = "SELECT * FROM employees";
    try (Connection connection = DatabaseConnection.getConnection();PreparedStatement preparedStatement =connection.prepareStatement(query);ResultSet resultSet=preparedStatement.executeQuery()){
        while (resultSet.next()) {
            System.out.println("Employee ID: " + resultSet.getString("id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Email: " + resultSet.getString("email"));
            System.out.println("Phone: " + resultSet.getString("phone"));
            System.out.println("Role: " + resultSet.getString("role"));
        }
    }catch (SQLException e){
        System.out.println("Error retriving employees! ");
        e.printStackTrace();
    }
}

    public static Connection getConnection() {
         Connection connection = null;
        return connection;
    }
}
