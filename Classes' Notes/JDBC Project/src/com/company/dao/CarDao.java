package com.company.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Car;

public class CarDao {

    private final Connection connection;

    public CarDao(Connection connection) {
        this.connection = connection;
    }

    public Car getById(Integer id) throws SQLException {

        String query = "SELECT * FROM CAR WHERE ID = '" + id + "'";

        Statement stmt = connection.createStatement();

        ResultSet rs = stmt.executeQuery(query);

        List<Car> cars = new ArrayList<Car>();

        while (rs.next()) {
            String brand = rs.getString("BRAND");
            String model = rs.getString("MODEL");
            Integer age = rs.getInt("YEAR");
            Car person = new Car(id, brand, model, age);
            cars.add(person);
        }
        return !cars.isEmpty() ? cars.get(0) : null;
    }

    public void delete(Car car) throws SQLException {

        String query = "DELETE FROM CAR WHERE ID = '" + car.id + "'";

        Statement stmt = connection.createStatement();

        stmt.execute(query);

    }

    public void save(Car car) throws SQLException {

        String query = "INSERT INTO CAR (ID, BRAND, MODEL, YEAR) VALUES (" + car.id + ",'" + car.brand +
                "','" + car.model + "'," + car.year + ");";

        Statement stmt = connection.createStatement();

        stmt.execute(query);

    }

    public void update(Car car) throws SQLException {

        String query = "UPDATE CAR SET (ID, BRAND, MODEL, YEAR) = (" + car.id + ",'" + car.brand +
                "','" + car.model + "'," + car.year + ") WHERE ID = " + car.id + ";";

        Statement stmt = connection.createStatement();

        stmt.execute(query);

    }
}
