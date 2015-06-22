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
            String name = rs.getString(String.valueOf(getColumnsArray().get(1)));
            String lastName = rs.getString(String.valueOf(getColumnsArray().get(2)));
            Integer age = rs.getInt(String.valueOf(getColumnsArray().get(3)));
            Integer id = rs.getInt(String.valueOf(getColumnsArray().get(0)));
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

    @Override
    public String getColumns() {
        ArrayList list = getColumnsArray();
        String a = "(" + list.get(0);
        for (int i = 1; i < list.size(); i++){
            a = a.concat(", ");
            a = a.concat(String.valueOf(list.get(i)));
        }
        a = a.concat(")");
        return a;
    }

    @Override
    public ArrayList getColumnsArray() {
        List<String> list = new ArrayList<String>();
        list.add(getPrimaryKey());
        list.add("NAME");
        list.add("LAST_NAME");
        list.add("AGE");
        return (ArrayList) list;
    }

    public String getColumnsValues(Person person){
        return "(" + person.id + ",'" + person.name + "','" + person.lastName + "'," + person.age + ")";
    }

    public int getPrimaryKeyValue(Person person) {
        return person.id;
    }

    public void delete(Person person) throws SQLException {
        String query = "DELETE FROM " + getTable() + " WHERE " + getPrimaryKey() +
                " = " + getPrimaryKeyValue(person) + ";";
        super.makeQuery(query);
    }

    public void update(Person person) throws SQLException {
        String query = "UPDATE " + getTable() + " SET " + getColumns() + " = " + getColumnsValues(person) + " WHERE " +
                getPrimaryKey() + " = " + getPrimaryKeyValue(person) + ";";
        super.makeQuery(query);
    }

    public void save(Person person) throws SQLException {
        String query = "INSERT INTO " + getTable() + " " + getColumns() +
                " VALUES " + getColumnsValues(person) + ";";
        super.makeQuery(query);
    }
}