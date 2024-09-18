package com.and.Oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:47
@Last Modified 17/09/2024 21:47
Version 1.0
*/
public class PanggilConstructor {

    public static void main(String[] args) {
        System.out.println(new ContohConstructor());
        System.out.println(new ContohConstructor("paul","paul123","paul@123"));
        List l = new ArrayList();
        ContohConstructor contoh = new ContohConstructor();
        contoh.setNama("paul");
        contoh.setUsername("paul123");
        contoh.setPassword("paul123");
        contoh.panggilPublic = "10";

        Map<Integer,String> mapzz = new HashMap<>();
        l.add(contoh);
        l.add(new ContohConstructor("paul","paul123","paul@123"));

        ScopeEncapsule scopeEncapsule = new ScopeEncapsule("paul","paul123","paul@123");
        scopeEncapsule.getNama();
        scopeEncapsule.getEmail();
        scopeEncapsule.getPassword();
    }

    public static void getter1(int intX , String str){

    }

    public static void getter2(String str, int intX, String isNull){

    }
}
