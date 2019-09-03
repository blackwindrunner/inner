package com.ghost.f.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private int sex;
    @Column
    private String details;
}
