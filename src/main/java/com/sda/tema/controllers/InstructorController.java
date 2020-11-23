package com.sda.tema.controllers;

import com.sda.tema.controllers.jsons.Instructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/instructors")
public class InstructorController {

    @GetMapping
    public List<Instructor> findAll(){
        Instructor instructor1=new Instructor();
        Instructor instructor2=new Instructor();
        instructor1.setId(1);
        instructor1.setPicture("bla");
        instructor1.setName("Vasile Jecu");
        instructor1.setTopics("Java");
        instructor1.setRating(4.5);
        instructor1.setCourses(2300);
        instructor1.setStudents(240);
        instructor2.setId(2);
        instructor2.setPicture("bla");
        instructor2.setName("Ion Ciucu");
        instructor2.setTopics("Python");
        instructor2.setRating(4.7);
        instructor2.setCourses(2700);
        instructor2.setStudents(2280);
        return List.of(instructor1,instructor2);
    }

    @PutMapping
    public void save(@RequestBody Instructor instructor){
        System.out.println(instructor+" saved to database");
    }

}
