package com.and.Model;

import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:20
@Last Modified 17/09/2024 21:20
Version 1.0
*/
public class Divisi {

    private  Integer id;
    private String namaDivisi;
    private String deskripsiDivisi;
    private String congLongDivisi;
    private Double contohLohDouble;
    private List<BuatPassing> lt;

    public List<BuatPassing> getLt() {
        return lt;
    }

    public void setLt(List<BuatPassing> lt) {
        this.lt = lt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getDeskripsiDivisi() {
        return deskripsiDivisi;
    }

    public void setDeskripsiDivisi(String deskripsiDivisi) {
        this.deskripsiDivisi = deskripsiDivisi;
    }

    public String getCongLongDivisi() {
        return congLongDivisi;
    }

    public void setCongLongDivisi(String congLongDivisi) {
        this.congLongDivisi = congLongDivisi;
    }

    public Double getContohLohDouble() {
        return contohLohDouble;
    }

    public void setContohLohDouble(Double contohLohDouble) {
        this.contohLohDouble = contohLohDouble;
    }




}
