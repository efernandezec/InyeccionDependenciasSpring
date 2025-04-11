package com.di.inyeccion_dependencias;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

import com.di.inyeccion_dependencias.repositories.CarRepositoryJson;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@PropertySource(value = "classpath:config.properties", encoding = "UTF-8" )
public class AppConfig {

    @Value("${config.jsonPath}")
    private String jsonPath;

    @Bean
    ClassPathResource resource(){
        return new ClassPathResource(jsonPath);
    }

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

    // Se usaria como un bean, siempre y cuando CarRepositoryJson 
    // no tenga la anotación @Repository
    @Bean
    CarRepositoryJson carRepositoryJson(ClassPathResource resource, ObjectMapper objectMapper){
        return new CarRepositoryJson(resource, objectMapper);
    }

}
