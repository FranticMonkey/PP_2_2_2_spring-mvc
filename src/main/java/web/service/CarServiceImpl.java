package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>(5);

        cars.add(new Car(++COUNT, "lada", 666));
        cars.add(new Car(++COUNT, "lada", 365));
        cars.add(new Car(++COUNT, "tesla", 987));
        cars.add(new Car(++COUNT, "ford", 123));
        cars.add(new Car(++COUNT, "lada", 101));
    }

    @Override
    public List<Car> getListCars(Integer size) {
        if((size == null) || (size > cars.size()) || (size < 0)) {
            return cars;
        }
        return cars.subList(0, size);
    }
}
