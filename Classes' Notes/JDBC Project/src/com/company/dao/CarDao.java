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
        String query = "SELECT * FROM CAR WHERE ID = '" + id + "'";
        Car car = listById(super.queryReturnResultSet(query));
        return car;
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


    public void delete(Car car) throws SQLException {

        String query = "DELETE FROM CAR WHERE ID = " + car.id + ";";
        super.makeQuery(query);

    }

    public void update(Car car) throws SQLException {

        String query = "UPDATE CAR SET (ID, BRAND, MODEL, YEAR) = (" + car.id + ",'" + car.brand +
                "','" + car.model + "'," + car.year + ") WHERE ID = " + car.id + ";";
        super.makeQuery(query);
    }

    public void save(Car car) throws SQLException {

        String query = "INSERT INTO CAR (ID, BRAND, MODEL, YEAR) VALUES (" + car.id + ",'" + car.brand +
                "','" + car.model + "'," + car.year + ");";
        super.makeQuery(query);

    }

    //    public void delete(Car car) throws SQLException {
//
//        String query = "DELETE FROM CAR WHERE ID = '" + car.id + "'";
//
//        Statement stmt = connection.createStatement();
//
//        stmt.execute(query);
//
//    }
//
//    public void save(Car car) throws SQLException {
//
//        String query = "INSERT INTO CAR (ID, BRAND, MODEL, YEAR) VALUES (" + car.id + ",'" + car.brand +
//                "','" + car.model + "'," + car.year + ");";
//
//        Statement stmt = connection.createStatement();
//
//        stmt.execute(query);
//
//    }
//
//    public void update(Car car) throws SQLException {
//
//        String query = "UPDATE CAR SET (ID, BRAND, MODEL, YEAR) = (" + car.id + ",'" + car.brand +
//                "','" + car.model + "'," + car.year + ") WHERE ID = " + car.id + ";";
//
//        Statement stmt = connection.createStatement();
//
//        stmt.execute(query);
//
//    }
}
