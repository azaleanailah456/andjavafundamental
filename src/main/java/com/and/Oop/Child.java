package com.and.Oop;

import java.util.Map;
import java.util.Set;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:42
@Last Modified 17/09/2024 21:42
Version 1.0
*/
public class Child {

    public Child() {
        super();
    }

    public void panggil(String str){
        super.fungsi1();
        super.name = "";
        System.out.println(str);
    }


    public void fungsi1(){
        System.out.println("INI FUNGSI 1 dari CLASS PARENT !!");
    }

    public void panggil(Integer intX){
        System.out.println(Math.pow(intX,2));
    }

    public void panggil(Set<Object> s){
    }

    public void panggil(Map<String,Object> m){
    }
//    callSP -> mengembalikan recordSet
//    callSP -> Transaction
//    callSP -> File
//    callSP -> Bulk
}
