package com.sda.myapp.services;

import com.sda.myapp.contrlollers.jsons.PersonJson;
import com.sda.myapp.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    public List<PersonJson> findAll() {
       return personRepository.findAll();

    }

    public PersonJson findById( Integer id) {
       return personRepository.findById(id).get();
    }

    public void save(PersonJson personJson) {
       personRepository.save(personJson);
    }

    public void deleteById(Integer id){
        personRepository.deleteById(id);
    }


}
