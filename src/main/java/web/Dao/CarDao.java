package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> returnTheNumberOfCars(int number);
    public List<Car> createCarList();
}
