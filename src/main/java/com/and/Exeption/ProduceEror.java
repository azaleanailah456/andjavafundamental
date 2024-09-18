package com.and.Exeption;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:23
@Last Modified 17/09/2024 21:23
Version 1.0
*/
public class ProduceEror {

    public static void main(String[] args) {
        String strToArr = "Ini ; Saya ... ";
        char [] chArr = strToArr.toCharArray();
        System.out.println(chArr.length);
        int intTampung = 0;
        for (int i = 0; i < chArr.length; i++) {
            intTampung = chArr[i];
            if(intTampung>=58 && intTampung<=64) {
                throw new IllegalArgumentException("Karakter Tidak Diperbolehkan ... "+chArr[i]);
            }
        }
        System.out.println("Berhasil kesini ....");
    }
}
