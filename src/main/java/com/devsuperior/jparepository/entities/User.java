package com.devsuperior.jparepository.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String email;
    private Double salary;

    public User() {
    }

    public User(Long id, String name, String email, Double salaray) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salaray;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalaray() {
        return salary;
    }

    public void setSalaray(Double salaray) {
        this.salary = salaray;
    }
}
