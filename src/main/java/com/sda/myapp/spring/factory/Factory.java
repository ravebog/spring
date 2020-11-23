package com.sda.myapp.spring.factory;

import com.sda.myapp.spring.di.Injection3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {

    @Bean
    Product createProduct(){
        return new Product();
        //metoda de producere obiecte
        //produce singleton
    }

}
