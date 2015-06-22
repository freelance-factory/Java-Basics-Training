package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Car;

public class CarDao extends BaseDao<Car> {

    public CarDao(Connection connection) {
        super(connection);
    }

    @Override
    public Car getEntityFromResultSet(ResultSet rs) throws SQLException {
        List<Car> cars = new ArrayList<Car>();
        while (rs.next()) {
            String brand = rs.getString("BRAND");
            String model = rs.getString("MODEL");
            Integer year = rs.getInt("YEAR");
            Integer id = rs.getInt(getPrimaryKey());
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
            a = a.concat(String.valueOf(list.get(i)));
        }
        a = a.concat(")");
        return a;
    }

    @Override
    public String getColumnsValues(Car car){
        return "(" + car.getId() + ",'" + car.brand + "','" + car.model + "'," + car.year + ")";
    }

    @Override
    public int getPrimaryKeyValue(Car car) {
        return car.getId();
    }

//    public void delete(Car car) throws SQLException {
//        String query = "DELETE FROM " + getTable() + " WHERE " +
//                getPrimaryKey() + " = " + getPrimaryKeyValue(car) + ";";
//        super.makeQuery(query);
//    }
//
//    public void update(Car car) throws SQLException {
//        String query = "UPDATE " + getTable() + " SET " + getColumns() + " = " + getColumnsValues(car) + " WHERE " +
//        getPrimaryKey() + " = " + getPrimaryKeyValue(car) + ";";
//        super.makeQuery(query);
//    }
//
//    public void save(Car car) throws SQLException {
//        String query = "INSERT INTO " + getTable() + " " + getColumns() +
//        " VALUES " + getColumnsValues(car) + ";";
//        super.makeQuery(query);
//    }
}