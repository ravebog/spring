package com.sda.myapp.spring.di;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class Xxx {

    public void f(){
        System.out.println(this+" executed by "+Thread.currentThread());
    }

}
