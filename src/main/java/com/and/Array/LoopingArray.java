package com.and.Array;

import java.util.Random;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:03
@Last Modified 17/09/2024 21:03
Version 1.0
*/
public class LoopingArray {

    public static void main(String[] args) {
        Random rand = new Random();
        int intArr [] = new int[10];
        int arrLength = intArr.length;
        int intAssign = 0;
        for (int i = 0; i < arrLength; i++) {
            intAssign = rand.nextInt(100);
            System.out.println(intAssign);
            intArr[i] = intAssign;
        }

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Nilai intArr index ke "+i+" : "+intArr[i]);
        }

    }
}
