package com.ghost.f.inner.vo;

import lombok.Data;

@Data
public class StudentInfo {
    private String name;
    private String paymentMethod;
    private long money;
    private boolean isMonthlyKnots;
    private String details;
}
