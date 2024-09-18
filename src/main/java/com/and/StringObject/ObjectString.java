package com.and.StringObject;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 22:17
@Last Modified 17/09/2024 22:17
Version 1.0
*/
public class ObjectString {

    public static void main(String[] args) {
//        StringBuilder sBuilder = new StringBuilder();
//        CobaVariable cobaVariable = new CobaVariable();
//        System.out.println(cobaVariable);
//        String strX = new String("X");
//        System.out.println(strX);
//        XSS Protection
//                -> menu/
//                -> menuI2433
//        replaceAll(I2433,'/')
//        String strJ = new StringBuilder().append("2433").append("2433").append("2433").append("2433").append("2433").append("2433").toString();
//        char [] chArr = strJ.toCharArray();
//        System.out.println(strJ);
//        String strAlph = "abcdef";
//        char chArr [] = strAlph.toCharArray();
//        int intAlph = strAlph.length();
//        System.out.println(intAlph);
//        System.out.println(strAlph.charAt(2));
//        System.out.println(chArr[2]);
//        int intChArrLength = chArr.length;
//        for (int i = 0; i < intChArrLength; i++) {
//        }

        String strH = new String("Paul");
        String strI = new String("paul");
        System.out.println("Nilai STRH = "+strH);
        System.out.println("Nilai STRI = "+strI);
        System.out.println(strH==strI);
        System.out.println(strH.equals(strI));
        System.out.println(strH.equalsIgnoreCase(strI));

        String strDataSelundupan = "op74YK89NN";
        System.out.println(strDataSelundupan.substring(2));
        System.out.println(strDataSelundupan.substring(2,8));
    }
}
