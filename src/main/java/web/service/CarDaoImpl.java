package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> returnCarForList(int number) {
        List<Car> car;
        if (number >= 5) {
            car = createCarList();
        } else {
            car = createCarList().stream().limit(number).collect(Collectors.toList());
        }
        return car;
    }

    @Override
    public List<Car> createCarList() {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car(220, "Bmw", 2021));
        listCar.add(new Car(210, "Audi", 2020));
        listCar.add(new Car(200, "Mersedes", 2019));
        listCar.add(new Car(190, "Kia", 2018));
        listCar.add(new Car(1800, "Vokswagen", 2017));
        return listCar;
    }
}

