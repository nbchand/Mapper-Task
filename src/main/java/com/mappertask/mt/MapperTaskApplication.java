package com.mappertask.mt;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MapperTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperTaskApplication.class, args);
    }

    @Bean
    public ModelMapper initializeModelMapper() {
        return new ModelMapper();
    }

}
