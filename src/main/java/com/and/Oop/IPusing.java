package com.and.Oop;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:45
@Last Modified 17/09/2024 21:45
Version 1.0
*/
public interface IPusing<T> {

    public void save(T t);
    public void edit(T t);
    public void delete(T t);
}
