package com.sda.myapp.contrlollers;

import com.sda.myapp.contrlollers.jsons.PersonJson;
import com.sda.myapp.contrlollers.jsons.PersonJsonProjection;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {
    public List<PersonJsonProjection> map(List<PersonJson> all) {
        return all.stream().map(e->from(e)).collect(Collectors.toList());
    }

    public static PersonJsonProjection from (PersonJson json){
        PersonJsonProjection projection = new PersonJsonProjection();
        projection.setCnp(json.getCnp());
        projection.setName(json.getName());
        return projection;
    }
}
