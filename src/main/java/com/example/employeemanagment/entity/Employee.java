package com.example.employeemanagment.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name cannot by empty!")
    @Column(name = "name",nullable = false,unique = true)
    private String name;

    @NotNull(message = "Experience cannot be empty!")
    @Column(name = "experience",nullable = false)
    private String experience;

}
