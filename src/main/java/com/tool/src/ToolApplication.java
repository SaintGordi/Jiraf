package com.tool.src;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Think on 10/17/2017.
 */
@SpringBootApplication
public class ToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToolApplication.class, args);
    }
    //TODO Change all the model mapper situations with @Autowired annotation and constructor creation
    @Bean
    public ModelMapper createMapper() {
        return new ModelMapper();
    }
}
