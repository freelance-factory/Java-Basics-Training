package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Person;

public class PersonDao extends BaseDao<Person> {

    public PersonDao(Connection connection) {
        super(connection);
    }

    @Override
    public Person getEntityFromResultSet(ResultSet rs) throws SQLException {
        List<Person> people = new ArrayList<Person>();
        while (rs.next()) {
            String name = rs.getString("NAME");
            String lastName = rs.getString("LAST_NAME");
            Integer age = rs.getInt("AGE");
            Integer id = rs.getInt(getPrimaryKey());
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
    public List getColumns() {
        List list = new ArrayList<>();
        list.add(getPrimaryKey());
        list.add("NAME");
        list.add("LAST_NAME");
        list.add("AGE");
        return list;
    }

    @Override
    public List getColumnsValues(Person person){
        List list = new ArrayList();
        list.add(person.getId());
        list.add("'"+person.getName()+"'");
        list.add("'"+person.getLastName()+"'");
        list.add(person.getAge());
        return list;
    }

    @Override
    public int getPrimaryKeyValue(Person person) {
        return person.getId();
    }
}