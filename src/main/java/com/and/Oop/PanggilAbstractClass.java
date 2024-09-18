package com.and.Oop;

import com.and.Oop.model.Department;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:46
@Last Modified 17/09/2024 21:46
Version 1.0
*/
public class PanggilAbstractClass {

    public static void main(String[] args) {
        AbstractContoh contoh = new AbstractContoh() {
            @Override
            public void fungsi4() {
                System.out.println("Jalankan Fungsi Ini");
            }
        };
        contoh.fungsi4();

        List arrayList = new ArrayList();
        arrayList.add(contoh);
        arrayList.size();
        arrayList.clear();

        Department department = new Department();

        if(department.name==null){
            System.out.println("Department is null");
        }
        if(department.getName().equalsIgnoreCase("")){
            System.out.println("Department is Empty");
        }
        if(department.getName().equals(" ")){
            System.out.println("Department is is Blank");
        }


    }
}
