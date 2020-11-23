package com.sda.myapp.contrlollers;

import com.sda.myapp.contrlollers.jsons.PersonJson;
import com.sda.myapp.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor // genereaza constructorul
public class PersonController {

    final private PersonService personService;
    @GetMapping
    public List<PersonJson> findAll() {
        return personService.findAll();
    }
    @GetMapping("/{id}")
    public PersonJson findById(@PathVariable("id") Integer id) {
        return personService.findById(id);
    }
    @PutMapping
    public void save(@RequestBody PersonJson personJson) {
        personService.save(personJson);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        personService.deleteById(id);
    }
}
