package com.sda.myapp.spring.types;

import com.sda.myapp.spring.di.TargetDi;
import com.sda.myapp.spring.factory.Product;
import com.sda.myapp.spring.factory.TargetDIFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/container")
public class ApplicationContainerControllor {

    @Autowired
    ApplicationContext applicationContext;

    @GetMapping
    public void play(){
        System.out.println(applicationContext);
        System.out.println(applicationContext.getBean(MySingleton.class));
        System.out.println(applicationContext.getBean(MyPrototype.class));
        System.out.println(applicationContext.getBean(TargetDi.class));
        System.out.println(applicationContext.getBean(TargetDIFactory.class));
        System.out.println(applicationContext.getBean(Product.class));

    }

}
