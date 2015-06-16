package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Person;

public class PersonDao extends BaseDao {

    public PersonDao(Connection connection) {
        super(connection);
    }

    @Override
    public ResultSet rowById(Integer id) throws SQLException {

        String query = "SELECT * FROM PERSON WHERE ID = '" + id + "'";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        return rs;

    }

    @Override
    public Person listById(ResultSet rs) throws SQLException {
        List<Person> people = new ArrayList<Person>();
        while (rs.next()) {
            String name = rs.getString("NAME");
            String lastName = rs.getString("LAST_NAME");
            Integer age = rs.getInt("AGE");
            Integer id = rs.getInt("ID");
            Person person = new Person(id, name, lastName, age);
            people.add(person);
        }
        return !people.isEmpty() ? people.get(0) : null;

    }

    public void delete(Person person) throws SQLException {

        String query = "DELETE FROM PERSON WHERE ID = " + person.id + ";";
        super.makeQuery(query);

    }

    public void update(Person person) throws SQLException {

        String query = "UPDATE PERSON SET (ID, NAME, LAST_NAME, AGE) = (" + person.id + ",'" + person.name +
                "','" + person.lastName + "'," + person.age + ") WHERE ID = " + person.id + ";";
        super.makeQuery(query);
    }

    public void save(Person person) throws SQLException {

        String query = "INSERT INTO PERSON (ID, NAME, LAST_NAME, AGE) VALUES (" + person.id + ",'" + person.name +
                "','" + person.lastName + "'," + person.age + ");";
        super.makeQuery(query);

    }
}