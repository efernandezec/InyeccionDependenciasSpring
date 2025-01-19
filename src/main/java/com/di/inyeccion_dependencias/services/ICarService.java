package com.di.inyeccion_dependencias.services;

import java.util.List;

import com.di.inyeccion_dependencias.models.Car;

public interface ICarService {
    List<Car> getAll();
    Car getCatByLicensePlate(String LicensePlate);
}   
