package com.sda.myapp.mvc.controllers;

import com.sda.myapp.contrlollers.jsons.PersonJson;
import com.sda.myapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/persons")
public class PersonMVCController {

    @Autowired
    PersonService personService;

    @GetMapping(value = "/list")
    public String listPersons(Model model) {
        List<PersonJson> list = personService.findAll();

        model.addAttribute("persons", list);
        return "persons";
    }

    @GetMapping(value = "/createPerson")
    public String createPerson(Model model) {
        PersonJson personJson = new PersonJson();
        model.addAttribute("person", personJson);
        return "personCreate";
    }

    @PostMapping(value = "/savePerson")
    public String savePerson(Model model, @ModelAttribute PersonJson personJson, BindingResult error) {

        personService.save(personJson);
        List<PersonJson> list =personService.findAll();
        model.addAttribute("persons", list);

        return "persons";

    }

}

