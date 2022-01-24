package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.Dao.CarDao;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
      }


    @GetMapping(value = "/cars")
    public String CarList(@RequestParam(value = "count", required = true, defaultValue = "5") int count, Model model) {
        List<Car> newCar = carService.returnTheNumberOfCars(count);
        model.addAttribute("carList", newCar);
        return "carList";
    }

}