package com.and.Oop;

import java.util.HashMap;
import java.util.Map;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:43
@Last Modified 17/09/2024 21:43
Version 1.0
*/
public class CobaDynamic {

    public static void main(String[] args) {
//        nama -> paul
//        key -> value key -> value key -> value
        String strKV = "k1-v1#k2-v2#k3-v3#k4-v4#k5-v5#";
        String [] strArr = strKV.split("#");
        Map<String,Object> m = new HashMap<>();
        String strKVArr [] = new String[2];
        for (String str : strArr) {
            strKVArr = str.split("-");
            m.put(strKVArr[0],strKVArr[1]);
        }
        for(Map.Entry<String,Object> mapz : m.entrySet()) {
            System.out.println("Key : "+mapz.getKey()+" Value : "+mapz.getValue());
        }
    }
}
