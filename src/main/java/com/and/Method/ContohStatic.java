package com.and.Method;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:31
@Last Modified 17/09/2024 21:31
Version 1.0
*/
public class ContohStatic {

    private  int isStatic;

    public  ContohStatic(){

    }

    public  static  void main(String[] args){
        BedaClass bedaClass = new BedaClass(2);
        System.out.println(BedaClass.getiStatic());
//        bedaClass = new BedaClass();
//        bedaClass =new BedaClass();
    }
}
