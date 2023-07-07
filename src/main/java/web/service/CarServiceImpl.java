package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("TOYOTA","Black", 10));
        cars.add(new Car("MERCEDES","White", 5));
        cars.add(new Car("TESLA","Yellow", 1));
        cars.add(new Car("BMW","Blue", 3));
        cars.add(new Car("LADA","all colors", 25));
    }

    @Override
    public List<Car> limit(int a) {
        return cars.stream().limit(a).collect(Collectors.toList());
    }
}
