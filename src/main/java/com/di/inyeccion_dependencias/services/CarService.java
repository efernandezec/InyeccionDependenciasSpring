package com.di.inyeccion_dependencias.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.di.inyeccion_dependencias.models.Car;
import com.di.inyeccion_dependencias.repositories.ICarRepository;

@Service
public class CarService implements ICarService{

    
    @Autowired
    @Qualifier("carRepositoryJson")
    private ICarRepository repository;


    @Override
    public List<Car> getAll() {
        return repository.getAll();
    }

    @Override
    public Car getCatByLicensePlate(String LicensePlate) {
        return repository.getCarByLicensePlate(LicensePlate);
    }

}
