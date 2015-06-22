package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.company.model.Entity;

public abstract class BaseDao<T extends Entity> {

    protected final Connection connection;

    public BaseDao(Connection connection) {
        this.connection = connection;
    }

    public T getById(Integer id) throws SQLException {
        String query = "SELECT * FROM " + getTable() + " WHERE " + getPrimaryKey() + " = '" + id + "'";
        ResultSet resultSet = queryReturnResultSet(query);
        return getEntityFromResultSet(resultSet);
    }

    public ResultSet queryReturnResultSet(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(query);
    }

    public void delete(T entity) throws SQLException {
        String query = "DELETE FROM " + getTable() + " WHERE " + getPrimaryKey() + " = " + getPrimaryKeyValue(entity)+ ";";
        makeQuery(query);
    }

    public void save(T entity) throws SQLException {
        String query = "INSERT INTO " + getTable() + " " + getColumns() + " VALUES " + getColumnsValues(entity) + ";";
        makeQuery(query);
    }

    public void update(T entity) throws SQLException {
        String query = "UPDATE " + getTable() + " SET " + getColumns() + " = " + getColumnsValues(entity) + " WHERE " +
                getPrimaryKey() + " = " + getPrimaryKeyValue(entity) + ";";
        makeQuery(query);
    }

    public void makeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.execute(query);
    }

    public abstract T getEntityFromResultSet(ResultSet rs) throws SQLException;

    public abstract String getPrimaryKey();

    public abstract String getTable();

    public abstract String getColumns();

    public abstract int getPrimaryKeyValue(T entity);

    public abstract String getColumnsValues(T entity);

    protected String getTuplaAsString(List<Object> list) {
        String a = "(" + list.get(0);
        for (int i = 1; i < list.size(); i++){
            a = a.concat(", ");
            a = a.concat(String.valueOf(list.get(i)));
        }
        a = a.concat(")");
        return a;
    }
}
