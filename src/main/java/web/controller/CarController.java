package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String listOfCars(@RequestParam(value = "count", required = false) Integer count,
                             Model model) {
        CarService carService = new CarService();
        List<Car> cars = carService.getNCars(count);

        model.addAttribute("cars", cars);
        return "car";
    }

}
