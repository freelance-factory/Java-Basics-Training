package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Person;

public class PersonDao extends BaseDao {

    public PersonDao(Connection connection) {
        super(connection);
    }

    @Override
    public Person getById(Integer id) throws SQLException {
        String query = "SELECT * FROM " + getTable() + " WHERE " + getPrimaryKey() +
                " = '" + id + "'";
        return listById(super.queryReturnResultSet(query));
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

    @Override
    public String getPrimaryKey() {
        return "ID";
    }

    @Override
    public String getTable() {
        return "PERSON";
    }

    public String getColumns() {
        List<String> list = new ArrayList<String>();
        list.add(getPrimaryKey());
        list.add("NAME");
        list.add("LAST_NAME");
        list.add("AGE");
        String a = "(" + list.get(0);
        for (int i = 1; i < list.size(); i++){
            a = a.concat(", ");
            a = a.concat(list.get(i));
        };
        a = a.concat(")");
        return a;
    }

    public void delete(Person person) throws SQLException {
        String query = "DELETE FROM " + getTable() + " WHERE " + getPrimaryKey() +
                " = " + person.id + ";";
        super.makeQuery(query);
    }

    public void update(Person person) throws SQLException {
        String query = "UPDATE " + getTable() + " SET " + getColumns() + " = ("
                + person.id + ",'" + person.name + "','" + person.lastName + "',"
                + person.age + ") WHERE " + getPrimaryKey() + " = " + person.id + ";";
        super.makeQuery(query);
    }

    public void save(Person person) throws SQLException {
        String query = "INSERT INTO " + getTable() + " " + getColumns() +
                " VALUES (" + person.id + ",'" + person.name + "','" +
                person.lastName + "'," + person.age + ");";
        super.makeQuery(query);
    }
}