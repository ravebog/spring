package com.sda.myapp.contrlollers;


import com.sda.myapp.contrlollers.jsons.PersonJson;
import com.sda.myapp.contrlollers.jsons.PersonJsonProjection;
import com.sda.myapp.services.PersonService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest {

    @InjectMocks
    PersonController targetObject; // = new PersonController(created mock);


    @Mock
    PersonService mock;
    //echivalent- PersonService service = Mockito.mock(PersonService.class);

    @Test
    public void testFindAll() {

        //1.
        //Creare context de testare
        //1.1
        // definim mock-uri + comportamentul acestora
        List<PersonJson> jsons = new ArrayList<>();
        PersonJson personJson = new PersonJson();
        jsons.add(personJson);
        Mockito.when(mock.findAll()).thenReturn(jsons);
        HttpServletRequest request = new MockHttpServletRequest();

        //2.
        ResponseEntity<List<PersonJsonProjection>> responseEntity
                = targetObject.findAll(request, null);

        //3.

        //Assertions.assertTrue(responseEntity.getBody().isEmpty());
        Assertions.assertEquals(jsons,responseEntity.getBody());
        Assertions.assertSame(jsons,responseEntity.getBody()); //==

        //3.1 Verificam interactiunea cu Mock-urile si ordinea lor
        InOrder inOrder = Mockito.inOrder(mock);

        inOrder.verify(mock).audit(request);
        inOrder.verify(mock).findAll();


    }
}
