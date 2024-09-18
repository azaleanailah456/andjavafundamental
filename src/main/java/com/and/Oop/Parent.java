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
public class Parent {

    private int id;
    public String name;
    protected Long uuid;
    String noModif;


    public Parent() {
        AbstractContoh contoh = new AbstractContoh() {
            @Override
            public void fungsi4() {
                // call smtp gmail
                // call smtp ptdika
            }
        };
    }

    public void fungsi1(){
        System.out.println("INI FUNGSI 1 dari CLASS PARENT !!");
    }

    protected void fungsi2(){

    }

    void fungsi3(){

    }

    private void fungsi4(){

    }
}
