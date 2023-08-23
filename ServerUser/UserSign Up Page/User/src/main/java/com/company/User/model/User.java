package com.company.User.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {
    @Column(name="firstname")
    private String firstname;
    @Column (name = "lastname")
   private String lastname;

    @Id
    @Column(name="email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column (name = "confirmpassword")
    private String confirmpassword;


    public User(){}

    public User(String name,String email,String password){
        this.name=name;
        this.email=email;
        this.password=password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}
