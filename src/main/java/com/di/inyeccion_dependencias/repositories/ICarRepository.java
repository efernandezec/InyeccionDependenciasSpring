package com.di.inyeccion_dependencias.repositories;

import java.util.List;

import com.di.inyeccion_dependencias.models.Car;

public interface ICarRepository {
    List<Car> getAll();
    Car getCarByLicensePlate(String LicensePlate);
}
