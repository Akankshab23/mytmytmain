package com.myt.employee.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private Long empId;
    @Column(name = "EMP_FIRST_NAME")
    private String empFirstName;
    @Column(name = "EMP_LAST_NAME")
    private String empLastName;
    @Column(name = "EMP_EMAIL")
    private String empEmail;
    @Column(name = "DATE_OF_JOINING")
    private Date dateOfJoining;
    @Column(name = "SALARY")
    private double salary;

}
