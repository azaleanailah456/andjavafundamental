package com.and.UnitTesting;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 22:22
@Last Modified 17/09/2024 22:22
Version 1.0
*/
public class FunsionalText {

    public  Integer panjangText(String text){

        return text.length();
    }

    public Character hurufAwal(String text){
        return text.charAt(0);
    }

    public Character hurufAkhir(String text){
        return text.charAt(text.length()-1);
    }
}
