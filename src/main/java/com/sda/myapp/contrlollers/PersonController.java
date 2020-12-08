package com.sda.myapp.contrlollers;

import com.sda.myapp.contrlollers.exceptions.MyException;
import com.sda.myapp.contrlollers.jsons.PersonJson;
import com.sda.myapp.contrlollers.jsons.PersonJsonProjection;
import com.sda.myapp.services.PersonService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor // genereaza constructorul
@Validated

public class PersonController {


    final private PersonService personService;
    final private PersonMapper personMapper;

    @GetMapping
    public ResponseEntity<List<PersonJsonProjection>> findAll(HttpServletRequest request, HttpServletResponse response) {
            personService.audit(request);
            return ResponseEntity.ok(personMapper.map(personService.findAll()));

    }
    @GetMapping("/{id}")
    public PersonJson findById(@PathVariable("id") @Valid @Min(0) Integer id) {
        return personService.findById(id);
    }
    @PutMapping
    public void save(@RequestBody @Valid PersonJson personJson) {
        personService.save(personJson);

    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        personService.deleteById(id);
    }

    @GetMapping("/error")
    public void error() {
        throw new MyException("Belea");
    }

}
