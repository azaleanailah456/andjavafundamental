package com.and.Method;

import java.util.Map;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:30
@Last Modified 17/09/2024 21:30
Version 1.0
*/
public class BedaClass {

    @Override
    public String toString() {
        return "INI CLASS BEDA iStatic nilainya "+iStatic;
    }

    /**
     *  controller
     *  service
     *  repo
     *  dto
     *  model -> ORM (Konfigurasi ke Database)
     *  util
     *  security
     *  response
     */

    /**
     *  view
     *  controller
     *  service
     *  repo
     *  model
     *  util
     *  response
     */

    public static void main(String[] args) {
        String strX = "abcdefg";
        int intX = strX.length();
        System.out.println(strX.substring(2,intX-1));
    }

    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            String str3,
                            String str4
    ){


    }

    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            String str3,
                            int int1){

    }
    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            int int1,
                            int int2){

    }
    public void getAttribut(){

    }
    public static int iStatic;

    public BedaClass(int iStatic) {
        this.iStatic = iStatic;
    }

    public static int getiStatic() {
        return iStatic;
    }
}
