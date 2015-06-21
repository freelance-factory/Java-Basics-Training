package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Car;

public class CarDao extends BaseDao{

    public CarDao(Connection connection) {
        super(connection);
    }

    public Car getById(Integer id) throws SQLException {
        String query = "SELECT * FROM " + getTable() + " WHERE " +
                getPrimaryKey() + " = '" + id + "'";
        return listById(super.queryReturnResultSet(query));
    }

    @Override
    public Car listById(ResultSet rs) throws SQLException {
        List<Car> cars = new ArrayList<Car>();
        while (rs.next()) {
            String brand = rs.getString("BRAND");
            String model = rs.getString("MODEL");
            Integer year = rs.getInt("YEAR");
            Integer id = rs.getInt("ID");
            Car car = new Car(id, brand, model, year);
            cars.add(car);
        }
        return !cars.isEmpty() ? cars.get(0) : null;
    }

    @Override
    public String getPrimaryKey() {
        return "ID";
    }

    @Override
    public String getTable() {
        return "CAR";
    }

    @Override
    public String getColumns() {
        List<String> list = new ArrayList<String>();
        list.add(getPrimaryKey());
        list.add("BRAND");
        list.add("MODEL");
        list.add("YEAR");
        String a = "(" + list.get(0);
        for (int i = 1; i < list.size(); i++){
            a = a.concat(", ");
            a = a.concat(list.get(i));
        };
        a = a.concat(")");
        return a;
    }

    public void delete(Car car) throws SQLException {
        String query = "DELETE FROM " + getTable() + " WHERE " +
                getPrimaryKey() + " = " + car.id + ";";
        super.makeQuery(query);
    }

    public void update(Car car) throws SQLException {
        String query = "UPDATE " + getTable() + " SET " + getColumns() +
                " = (" + car.id + ",'" + car.brand + "','" + car.model +
                "'," + car.year + ") WHERE " + getPrimaryKey() + " = " +
                car.id + ";";
        super.makeQuery(query);
    }

    public void save(Car car) throws SQLException {
        String query = "INSERT INTO " + getTable() + " " + getColumns() +
                " VALUES (" + car.id + ",'" + car.brand + "','" +
                car.model + "'," + car.year + ");";
        super.makeQuery(query);
    }
}
