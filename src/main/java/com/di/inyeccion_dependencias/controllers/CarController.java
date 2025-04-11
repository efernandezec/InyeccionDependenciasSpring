package com.di.inyeccion_dependencias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.di.inyeccion_dependencias.models.Car;
import com.di.inyeccion_dependencias.services.ICarService;


@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    private ICarService service;

    @GetMapping("/cars")
    public List<Car> getAll(){
        return service.getAll();
    }

    @GetMapping("/cars/{licensePlate}")
    public Car getCarByLicensePlate(@PathVariable String licensePlate) {
        return service.getCatByLicensePlate(licensePlate);
    }
    
}
