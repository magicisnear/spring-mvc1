package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> returnTheNumberOfCars(int number);
    public List<Car> createCarList();
}
