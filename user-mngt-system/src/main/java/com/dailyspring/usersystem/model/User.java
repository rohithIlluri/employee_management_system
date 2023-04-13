package com.dailyspring.usersystem.model;

public class User {

    private long id;
    private String firstName;
    private String LastName;
    private String emailId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public User(long id, String firstName, String lastName, String emailId) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.emailId = emailId;
    }
    public User(){

    }
}
