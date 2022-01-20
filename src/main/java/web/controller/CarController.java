package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarDao;
import web.service.CarDaoImpl;

import java.util.List;

@Controller
public class CarController {

    CarDao carDao = new CarDaoImpl();

    @GetMapping(value = "/cars")
    public String CarList(@RequestParam(value = "count", required = true, defaultValue = "5") int count, Model model) {
        List<Car> newCar = carDao.returnCarForList(count);
        model.addAttribute("carList", newCar);
        return "carList";
    }

}