package com.and.LogikaPemprograman;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:27
@Last Modified 17/09/2024 21:27
Version 1.0
*/
public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata : ");
        String strInput = sc.nextLine();
        //kodok --> str1
        //kodok --> str2
        // str1 equals str2

        String strDariKanan = "";
        char [] chArr = strInput.toCharArray();
        int intChArr = chArr.length;
        for (int i = 0; i < intChArr; i++) {
            strDariKanan = strDariKanan + chArr[(intChArr-1)-i];
        }
        System.out.println("Nilai STR Dari Kanan adalah : "+strDariKanan);
        if(strDariKanan.equalsIgnoreCase(strInput)){
            System.out.println("Ini Palindrom");
        }else {
            System.out.println("Bukan Palindrom");
        }
    }
}
