package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(1,"BMV", 12));
        car.add(new Car(2,"Ford", 42));
        car.add(new Car(3,"Mazda", 15));
        car.add(new Car(4,"Audi", 46));
        car.add(new Car(5,"Chevrolet", 24));
    }

    @Override
    public List<Car> getAllCars(Integer count) {
        if (count == null || count >= 5) {
            return car;
        } else {
            return car.subList(0, count);
        }
    }
}
