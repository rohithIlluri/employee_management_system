package com.dailyspring.usersystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String LastName;
    private String emailId;

    public UserEntity(){
        this.id = id;

        this.firstName = firstName;
        LastName = lastName;
        this.emailId = emailId;
    }
    public long getId(){
        return id;
    }
}
