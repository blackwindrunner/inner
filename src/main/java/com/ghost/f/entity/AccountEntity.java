package com.ghost.f.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer studentId;
    @Column
    private Date date;
    @Column
    private String paymentMethod;

    @Column
    private boolean monthlyKnots;
    @Column
    private int money;
    @Column
    private Date time;

}
