package com.and.Oop;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:47
@Last Modified 17/09/2024 21:47
Version 1.0
*/
public class ScopeEncapsule {

    private String nama;
    private String password;
    private String email;

    public ScopeEncapsule(String nama, String password, String email) {
        this.nama = nama;
        this.password = password;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
