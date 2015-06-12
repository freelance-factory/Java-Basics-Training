package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Person;

public class BaseDao {
    private final Connection connection;

    public BaseDao(Connection connection) {
        this.connection = connection;
    }

    /*
     *
     * gerById()
     * delete(Person person)
     * save(Person person)
     * update(Person person)
     *
     */

    public Person getById(Integer id) throws SQLException { // //SQL works with exceptions to notify about errors.

        String query = "SELECT * FROM PERSON WHERE ID = '" + id + "'"; //We define the statement to be used in SQL.

        Statement stmt = connection.createStatement(); //

        ResultSet rs = stmt.executeQuery(query); //We use the predefined statement and save the incoming results in the rs.

        List<Person> people = new ArrayList<Person>();

        while (rs.next()) { //rs.next makes a reference to the next row. So, the while loop will run until there are no more rows.
            String name = rs.getString("NAME");
            String lastName = rs.getString("LAST_NAME");
            Integer age = rs.getInt("AGE");
            Person person = new Person(id, name, lastName, age);
            people.add(person);
        }
        return !people.isEmpty() ? people.get(0) : null;
    }

    public void delete(Integer id) throws SQLException {

        String query = "DELETE FROM PERSON WHERE ID = '" + id + "'";

        Statement stmt = connection.createStatement();

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {

        }

    }

}
