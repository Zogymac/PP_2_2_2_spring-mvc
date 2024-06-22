package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("lada", 2, "white"));
        cars.add(new Car("toyota", 1, "red"));
        cars.add(new Car("bmw", 5, "black"));
        cars.add(new Car("xiaomi", 1, "white"));
        cars.add(new Car("changan", 777, "red"));
    }

    public List<Car> getNCars(Integer count) {
        if (count == null ||count > cars.size()) {
            count = cars.size();
        }

        return new ArrayList<>(cars.subList(0, count));
    }

}
