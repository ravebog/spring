package com.sda.myapp.spring.types;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "aaa")
public class MySingleton {

    MySingleton(){
        System.out.println("construct "+this);
    }

    @PostConstruct
    public void construct(){
        System.out.println("initializare "+this);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("distruge "+this);
    }

}
