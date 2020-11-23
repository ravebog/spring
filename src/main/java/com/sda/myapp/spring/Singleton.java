package com.sda.myapp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //creaza o singura instanta a acestuia si o tine in memorie.
public class Singleton {



    public String hello(){
        return "Bogdan";
    }
}
