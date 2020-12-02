package com.sda.myapp.contrlollers;

import com.sda.myapp.contrlollers.jsons.PersonJson;
import com.sda.myapp.services.PersonService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor // genereaza constructorul
public class PersonController {


    final private PersonService personService;
    @GetMapping
    public ResponseEntity<List<PersonJson>> findAll(HttpServletRequest request, HttpServletResponse response) {
        return ResponseEntity.ok(personService.findAll());
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
