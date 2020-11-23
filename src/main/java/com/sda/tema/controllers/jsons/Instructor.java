package com.sda.tema.controllers.jsons;

import lombok.Data;

@Data
public class Instructor {

    private Integer id;
    private String picture;
    private String name;
    private String topics;
    private Double rating;
    private Integer students;
    private Integer courses;

}
