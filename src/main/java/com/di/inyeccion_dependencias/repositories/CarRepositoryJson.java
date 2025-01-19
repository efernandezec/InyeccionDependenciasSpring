package com.di.inyeccion_dependencias.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.di.inyeccion_dependencias.models.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class CarRepositoryJson implements ICarRepository{

    private List<Car> list;
    private final ClassPathResource resource;
    private final ObjectMapper objectMapper;

    public CarRepositoryJson(ClassPathResource resource, ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
        this.resource = resource;

        try {
            list = Arrays.asList(this.objectMapper.readValue(this.resource.getFile(), Car[].class));
            System.out.println(list);
        }  catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    @Override
    public List<Car> getAll() {
        // list.stream().forEach(car -> System.out.println(car.toString()));
        return list;
    }

    @Override
    public Car getCarByLicensePlate(String LicensePlate) {
        return list.stream().filter(car -> car.getLicencePlate().equals(LicensePlate)).findFirst().orElse(null);
    }

}
