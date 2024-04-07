package com.model;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class user {
        
    @Id
    private String name;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String email;
    private String password;
    private String cpassword;

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
    public String getCpassword() {
        return cpassword;
    }
    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
    
    
}
