package com.and.Thread;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 22:20
@Last Modified 17/09/2024 22:20
Version 1.0
*/
public class Async {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 3; i++) {


            if(i==1){
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        for(int j=0;j<4;j++){
                            System.out.println("INI Thread "+Thread.currentThread().getId()+" j ke : "+j);
                        }
                    }
                });
                thread.start();
            }
            System.out.println("INI Thread "+Thread.currentThread().getId());
        }
    }
}
