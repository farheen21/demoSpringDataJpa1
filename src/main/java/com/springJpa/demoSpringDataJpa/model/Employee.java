package com.springJpa.demoSpringDataJpa.model;import jakarta.persistence.*;import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;@AllArgsConstructor@NoArgsConstructor@Getter@Setter@Entity@Table( name = "Employee")public class Employee {    @Id    @GeneratedValue (strategy = GenerationType.IDENTITY)      private long empId;      private String emp_name;      private float salary;      private int emp_age;      private String emp_city;}