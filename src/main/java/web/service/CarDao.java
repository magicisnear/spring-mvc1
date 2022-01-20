package web.service;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> returnCarForList(int number);
    public List<Car> createCarList();
}
