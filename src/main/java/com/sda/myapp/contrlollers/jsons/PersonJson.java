package com.sda.myapp.contrlollers.jsons;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name="persoana")
public class PersonJson {
    @Id
    @Column(name = "cnp")
    private Integer cnp;

    @NotEmpty
    @Column(name="name")
    private String name;

}
