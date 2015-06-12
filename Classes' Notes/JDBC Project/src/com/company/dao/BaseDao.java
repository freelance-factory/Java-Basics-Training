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

        String query = "SELECT * FROM PERSON WHERE ID = '" + id + "'"; //We define the 

        Statement stmt = connection.createStatement();

        ResultSet rs = stmt.executeQuery(query);

        List<Person> people = new ArrayList<Person>();

        while (rs.next()) {
            String name = rs.getString("NAME");
            String lastName = rs.getString("LAST_NAME");
            Integer age = rs.getInt("AGE");
            Person person = new Person(id, name, lastName, age);
            people.add(person);
        }
        return !people.isEmpty() ? people.get(0) : null;
    }

}
