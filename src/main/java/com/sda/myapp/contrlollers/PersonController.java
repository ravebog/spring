package com.sda.myapp.contrlollers;

import com.sda.myapp.contrlollers.jsons.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping
    public List<Person> findAll() {
        Person person1 = new Person();
        person1.setCnp(1);
        person1.setName("ion");
        Person person2 = new Person();
        person2.setCnp(2);
        person2.setName("marian");


        return List.of(person1, person2);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") Integer id) {
        Person person = new Person();
        person.setCnp(id);
        person.setName("persoana cu id");
        return person;
    }


    @PutMapping
    public void save(@RequestBody Person person) {
        System.out.println("save this " + person);
    }
}
