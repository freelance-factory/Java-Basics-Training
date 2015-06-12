package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.company.dao.PersonDao;
import com.company.model.Person;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;

        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/jdbcproject", "postgres",
                    "postgres");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");

            PersonDao personDao = new PersonDao(connection);
            try {
                Person person;
                person = personDao.getById(655321);
                System.out.printf(person.toString());
            } catch (SQLException e) {
                System.out.println("Error while playing with the DB");
                e.printStackTrace();
            }

        } else {
            System.out.println("Failed to make connection!");
        }

    }
}
