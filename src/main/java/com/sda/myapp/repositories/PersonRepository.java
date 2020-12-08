package com.sda.myapp.repositories;

import com.sda.myapp.contrlollers.jsons.PersonJson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonJson,Integer> {
}
