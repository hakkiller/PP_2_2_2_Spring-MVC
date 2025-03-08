package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carlist = new ArrayList<>(List.of(
            new Car("Nissan Almera Classic", 2009, 510000),
            new Car("Toyota Avensis", 2007, 900000),
            new Car("Renault Duster", 2013, 780000),
            new Car("JAC J7", 2021, 1000000),
            new Car("Lada Priora", 2009, 284000)
    ));

    @Override
    public List<Car> getCarList(Integer count) {
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
        return carlist.stream().limit(count).toList();
    }
}