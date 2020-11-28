package com.sda.myapp.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TargetDi {

    @Autowired
    Xxx xxx;

    @Autowired
    private Injection1 injection1;

    private Injection2 injection2;

    @Autowired
    public TargetDi(Injection2 injection2) {
        this.injection2 = injection2;
    }

    private Injection3 injection3;

    @Autowired
    public void setInjection3(Injection3 injection3) {
        this.injection3 = injection3;
    }
}
