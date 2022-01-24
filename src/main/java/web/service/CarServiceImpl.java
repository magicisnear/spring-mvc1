package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao cardao;

    @Override
    public List<Car> returnTheNumberOfCars(int number) {
        return cardao.returnTheNumberOfCars(number);
    }

    @Override
    public List<Car> createCarList() {
        return cardao.createCarList();
    }
}
