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

    public ResultSet rowById(Integer id) throws SQLException {

        String query = "SELECT * FROM ENTITY WHERE ID = '" + id + "'";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        return rs;
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


    public void delete(Entity entity) throws SQLException {

        String query = "DELETE FROM ENTITY WHERE ID = '" + entity.id + "'";

    }

    public void save(Entity entity) throws SQLException {

        String query = "INSERT INTO ENTITY ID VALUES " + entity.id;

    }

    public void update(Entity entity) throws SQLException {

        String query = "UPDATE PERSON SET ID = " + entity.id + " WHERE ID = " + entity.id + ";";

    }

    public void makeQuery(String query) throws SQLException {

        Statement stmt = connection.createStatement();
        stmt.execute(query);

    }

}
