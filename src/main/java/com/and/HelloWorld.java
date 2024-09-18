package com.and;

import com.sun.tools.javac.Main;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 20:34
@Last Modified 17/09/2024 20:34
Version 1.0
*/
public class HelloWorld {
    public static String msg;
    public static void main(String[] args) {
        Main main = new Main();
        String [] str = "1 2 3".split(" ");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}