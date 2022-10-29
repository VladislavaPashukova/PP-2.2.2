package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> CAR_LIST(Integer count);
}
