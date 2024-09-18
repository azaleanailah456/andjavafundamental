package com.and.Exeption;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:22
@Last Modified 17/09/2024 21:22
Version 1.0
*/
public class KeywordThrow {

    //IlegalException menangani object terlarang yang dibuat, bisa untu
    ///bisa untuk pengangan validasi
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the keyword: ");
        String strKeyword = sc.nextLine();
        System.out.println("Input String" + strKeyword);
        if(strKeyword.contains("Saya")){
            throw new IllegalArgumentException("Anda memasukan kata terlarang !!, yaitu " + strKeyword);
        }
    }

    public static void getData() throws ArithmeticException{

    }

    public static  void catchData(){
        try{
            getData();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
