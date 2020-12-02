package com.sda.myapp.spring.types;

import com.sda.myapp.spring.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "aaa")
public class MySingleton {

@Autowired
AppConfig appConfig;

    MySingleton(){
        System.out.println("construct "+this);

    }

    @PostConstruct
    public void construct(){
        System.out.println("initializare "+this);
        System.out.println(appConfig.getDummyProperty());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("distruge "+this);
    }

    public void service(){
        System.out.println("Business complex bre");
    }

}
