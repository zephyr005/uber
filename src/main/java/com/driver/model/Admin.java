package com.driver.model;


import javax.persistence.*;

@Entity
public class Admin{



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AdminId;



    @Column(nullable = false,unique = true)
    private String username;

    private String password;

    public Admin(){

    }

    public Admin(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }
}