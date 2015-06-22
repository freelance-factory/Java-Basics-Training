package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Entity;

public class BaseDao {

    protected final Connection connection;

    public BaseDao(Connection connection) {
        this.connection = connection;
    }

    public Entity getById(Integer id) throws SQLException {
        String query = "SELECT * FROM " + getTable() + " WHERE " +
                getPrimaryKey() + " = '" + id + "'";
        return listById(queryReturnResultSet(query));
    }

    public ResultSet queryReturnResultSet(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(query);
    }

    public Entity listById(ResultSet rs) throws SQLException {
        List<Entity> entities = new ArrayList<Entity>();
        while (rs.next()) {
            Integer id = rs.getInt("ID");
            Entity entity = new Entity(id);
            entities.add(entity);
        }
        return !entities.isEmpty() ? entities.get(0) : null;
    }

    public String getPrimaryKey() {
        return "ID";
    }

    public String getTable() {
        return "ENTITY";
    }

    public String getColumns() {
        List<String> list = new ArrayList<String>();
        list.add(getPrimaryKey());
        String a = "(" + list.get(0);
        for (int i = 1; i < list.size(); i++){
            a = a.concat(", ");
            a = a.concat(list.get(i));
        };
        a = a.concat(")");
        return a;
    }

    public void delete(Entity entity) throws SQLException {
        String query = "DELETE FROM " + getTable() + " WHERE ID = '" +
                entity.id + "'";
    }

    public void save(Entity entity) throws SQLException {
        String query = "INSERT INTO " + getTable() + " ID VALUES " +
                entity.id;
    }

    public void update(Entity entity) throws SQLException {
        String query = "UPDATE " + getTable() + " SET " + getPrimaryKey() +
                " = " + entity.id + " WHERE ID = " + entity.id + ";";
    }

    public void makeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.execute(query);
    }

}
