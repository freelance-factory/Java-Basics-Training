package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.dao.PersonDao;
import com.company.model.Car;
import com.company.model.Person;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person(655322,"Leonardo","Riviere",24);
        Person p2 = new Person(655324,"Cristian","Miranda",24);
        Person p3 = new Person(655325,"John Wayne","Cleaver",20);
        Person p4 = new Person(655323,"Rafe","Spall",29);
        Car c1 = new Car(4001,"Volkswagen","Fox",2013);
        Car c2 = new Car(4003,"Volkswagen","Gol",2015);
        Car c3 = new Car(4002,"Volkswagen","Vento",2006);


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
                Person person1;
                ResultSet rs2;
                rs2 = personDao.rowById(655321);
                person1 = personDao.listById(rs2);
                System.out.printf(person1.toString());
                personDao.delete(p4);
                personDao.save(p2);
                personDao.save(p3);
                personDao.update(p1);

//                Car car1;
//                ResultSet rs1;
//                rs1 = carDao.rowById(4001);
//                car1 = carDao.listById(rs1);
//                System.out.printf(car1.toString());
//                carDao.delete(c3);
//                carDao.save(c2);
//                carDao.update(c1);


            } catch (SQLException e) {
                System.out.println("Error while playing with the DB");
                e.printStackTrace();
            }

        } else {
            System.out.println("Failed to make connection!");
        }

    }
}
