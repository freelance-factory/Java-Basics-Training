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
    public List getColumns() {
        List list = new ArrayList<>();
        list.add(getPrimaryKey());
        list.add("BRAND");
        list.add("MODEL");
        list.add("YEAR");
        return list;
    }

    @Override
    public List getColumnsValues(Car car) {
        List list = new ArrayList();
        list.add(car.getId());
        list.add("'"+car.getBrand()+"'");
        list.add("'"+car.getModel()+"'");
        list.add(car.getYear());
        return list;
    }

    @Override
    public int getPrimaryKeyValue(Car car) {
        return car.getId();
    }
}
