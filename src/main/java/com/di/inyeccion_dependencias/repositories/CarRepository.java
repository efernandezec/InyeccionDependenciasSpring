package com.di.inyeccion_dependencias.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.di.inyeccion_dependencias.models.Car;

@Repository
public class CarRepository implements ICarRepository {

    private List<Car> list;

    public CarRepository(){
        this.list = Arrays.asList(
            new Car("0243 LMZ", "Audi", "Black", 5),
            new Car("2450 NXB", "Audi", "White", 3),
            new Car("3270 HSR", "Ford", "Red", 5),
            new Car("5456 URN", "Audi", "White", 2)
        );
    }
    @Override
    public List<Car> getAll() {
        return list;
    }

    @Override
    public Car getCarByLicensePlate(String LicensePlate) {
        return list
        .stream()
        .filter(car -> car.getLicencePlate().equals(LicensePlate))
        .findFirst()
        .orElse(null);
    }

}
