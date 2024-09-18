package com.and.WrapperClass;

import com.and.Model.BuatPassing;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 22:27
@Last Modified 17/09/2024 22:27
Version 1.0
*/
public class ContohGenericClass {

    public  static void main(String arg[]){
        List<Double> list = new ArrayList<>();
        ///parseInt digunakan untuk merubah string ke int
        String strNomor = "5";
        int intNomor = Integer.parseInt(strNomor);
        System.out.println(intNomor);

        System.out.println("\n");
        //contoh type data primitif
        int intX =2;
        int intY = intX;
        System.out.println(intX);
        System.out.println(intY);
        intY = 4;
        System.out.println(intX);
        System.out.println(intY); /// kenapa intY nilai jadi 4 karna intY dibawah tidak lagi menyimpan memori sebelumnya .

        System.out.println("\n");
        BuatPassing buatPassing = new BuatPassing();
        BuatPassing buatPassing1 = buatPassing;
        System.out.println(buatPassing);
        System.out.println(buatPassing1);
        buatPassing.setId(5);
        System.out.println(buatPassing1.getId());
        buatPassing1.setId(7);
        System.out.println(buatPassing.getId());

        System.out.println("\n");
        Integer integerX = 10;
        int integerY = integerX;
        System.out.println(integerX);
        System.out.println(integerY);

        System.out.println("\n");
        integerY = 12;
        System.out.println(integerX);
        System.out.println(integerY);

        System.out.println("\n");
        int intZ = 8;
        intZ = injectValuePrimitif(intZ);
        System.out.println(intZ);
        BuatPassing buatPassing3 = new BuatPassing();
        buatPassing3.setId(5);

        System.out.println("\n");
        injectValueObject(buatPassing3);
        System.out.println(buatPassing3.getId());
        System.out.println(Double.parseDouble("1200.5")); ////type data double
        System.out.println(7*3*0.5);

        System.out.println("Rubah integer to string");
        System.out.println(Integer.toString(15)+(7*3*0.5));
        System.out.println(1010101);
        int intLength = String.valueOf(1010110).length(); ///length() digunakan untuk menghitung karakter object
        System.out.println(intLength);



    }

    public static  Integer injectValuePrimitif(int intH){
        return intH = 12;
    }

    public static void injectValueObject(BuatPassing buatPassingX){
        System.out.println(buatPassingX);
        System.out.println(buatPassingX.getId());
        buatPassingX.setId(5);
    }
}
