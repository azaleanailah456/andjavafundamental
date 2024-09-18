package com.and.StringObject;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 22:17
@Last Modified 17/09/2024 22:17
Version 1.0
*/
public class IOScanner {

    public static void main(String[] args){
        //scanner adalah nama object
        Scanner scanner = new Scanner(System.in);
        //// Type String
        System.out.println("Masukan Nama anda");
        String strNama = scanner.nextLine(); // Penampung object
        System.out.println("Nama anda adalah : "+strNama);

        ///Type integer
        System.out.println("Masukan  Nilai Bilangan Bulat :");
        int intNilai = scanner.nextInt();
        System.out.println("Nilai Bilangan Bulat adalah : " + intNilai);

        ///Type Double
        System.out.println("Masukan  Nilai Bilangan Bulat :");
        double douNilai = scanner.nextDouble();
        System.out.println("Nilai Bilangan Bulat adalah : " + douNilai);


    }
}
