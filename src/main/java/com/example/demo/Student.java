package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)

    private String lastName;

    @Column (nullable = false)

    private String firstName;

    @Column (nullable = false, unique = true)

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
