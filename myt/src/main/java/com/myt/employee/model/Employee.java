package com.myt.employee.model;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private Long empId;
    private String empFirstName;
    private String empLastName;
    private String empEmail;
    private Date dateOfJoining;
    private double salary;
}
