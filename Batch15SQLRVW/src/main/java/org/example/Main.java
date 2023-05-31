package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";
        Connection connection;

        try {
            connection = DriverManager.getConnection(dbUrl,userName,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from person");
            while (resultSet.next()){
                String id = resultSet.getString("id");
                String firstName = resultSet.getString("firstName");
                String lastname = resultSet.getString("lastname");
                System.out.println(id+" "+firstName+" "+lastname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}