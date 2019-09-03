package com.ghost.f.vo;

import lombok.Data;


@Data
public class AccountVO {
    private int studentId;
    private String date;
    private String time;
    private String paymentMethod;
    private int money;
    private boolean isMonthlyKnots;
}
