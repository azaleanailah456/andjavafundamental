package com.and.ProgrammingBasics;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 22:12
@Last Modified 17/09/2024 22:12
Version 1.0
*/
public class PassingBy {

    public  static  void main (String[] args){
        int intX = 0;
        intX = getDataX();

        System.out.println(intX);
        List<Integer> listX = getDataList();
        int intList = listX.size();
        for (int i = 0; i < getDataList().size(); i++){

        }
    }

    public static Integer getDataX(){
        return ((10*8)-2) + 6;
    }

    public static List getDataList(){
        String strX = "Hello World";

        List list = new ArrayList();
        list.add(strX);
        list.add(strX + "abc");
        list.add(strX + "2323");

        return  list;
    }
}
