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

    @Override
    public Car getById(Integer id) throws SQLException {
        String query = "SELECT * FROM " + getTable() + " WHERE " +
                getPrimaryKey() + " = '" + id + "'";
        return listById(super.queryReturnResultSet(query));
    }

    @Override
    public Car listById(ResultSet rs) throws SQLException {
        List<Car> cars = new ArrayList<Car>();
        while (rs.next()) {
            String brand = rs.getString(String.valueOf(getColumnsArray().get(1)));
            String model = rs.getString(String.valueOf(getColumnsArray().get(2)));
            Integer year = rs.getInt(String.valueOf(getColumnsArray().get(3)));
            Integer id = rs.getInt(String.valueOf(getColumnsArray().get(0)));
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
        list.add("BRAND");
        list.add("MODEL");
        list.add("YEAR");
        return (ArrayList) list;
    }

    public String getColumnsValues(Car car){
        return "(" + car.id + ",'" + car.brand + "','" + car.model + "'," + car.year + ")";
    }

    public int getPrimaryKeyValue(Car car) {
        return car.id;
    }

    public void delete(Car car) throws SQLException {
        String query = "DELETE FROM " + getTable() + " WHERE " +
                getPrimaryKey() + " = " + getPrimaryKeyValue(car) + ";";
        super.makeQuery(query);
    }

    public void update(Car car) throws SQLException {
        String query = "UPDATE " + getTable() + " SET " + getColumns() + " = " + getColumnsValues(car) + " WHERE " +
        getPrimaryKey() + " = " + getPrimaryKeyValue(car) + ";";
        super.makeQuery(query);
    }

    public void save(Car car) throws SQLException {
        String query = "INSERT INTO " + getTable() + " " + getColumns() +
        " VALUES " + getColumnsValues(car) + ";";
        super.makeQuery(query);
    }
}