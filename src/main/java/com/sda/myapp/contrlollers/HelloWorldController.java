package com.sda.myapp.contrlollers;

import com.sda.myapp.spring.Singleton;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/aaa")
@RequiredArgsConstructor
public class HelloWorldController {

    //@Autowired //marcheaza o dependinta
    final Singleton singleton;

//    public HelloWorldController(Singleton singleton){
//        this.singleton=singleton;
//    }

//    public HelloWorldController(@Autowired Singleton singleton){
//        this.singleton=singleton;
//    }

    @GetMapping
    public String hello(){
        return singleton.hello();
    }

}
