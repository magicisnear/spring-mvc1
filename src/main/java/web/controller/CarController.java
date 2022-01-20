package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarDao;

import java.util.List;

@Controller
public class CarController {

    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }


    @GetMapping(value = "/cars")
    public String CarList(@RequestParam(value = "count", required = true, defaultValue = "5") int count, Model model) {
        List<Car> newCar = carDao.returnCarForList(count);
        model.addAttribute("carList", newCar);
        return "carList";
    }

}