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
public class OperatorAritmatika {

    public static String TOKEN_JWT = "";
    public  Double tambah(Double a, Double b){
        TOKEN_JWT = TOKEN_JWT + a +",";
        return a + b;
    }

    public Double kurang(Double a, Double b){
        return a - b;
    }

    public Double kali(Double a, Double b){
        return  a * b;
    }

    public Double bagi(Double a, Double b){
        return a / b;
    }

    public  Double modulus(Double a, Double b){
        return a % b;
    }
}
