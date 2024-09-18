package com.and.Exeption;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:21
@Last Modified 17/09/2024 21:21
Version 1.0
*/
public class ClassifiedException {

    public static void main(String [] args){
        try{
            Thread.sleep(10);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        // penganan eror
        ///Jika Bingung pilih handle exception pilih saja "Exception"
        System.out.println("INI DI EKSEKUSI....");
        try{
            int intX = 1/0;
            int intY = intX;
        }catch (Exception e){
            System.out.println("Ketangkap ni eror " + e.getMessage());
        }
        System.out.println("Berhenti Disini.....");
    }
}
