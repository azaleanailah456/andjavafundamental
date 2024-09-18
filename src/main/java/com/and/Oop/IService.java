package com.and.Oop;

import com.and.Oop.model.Department;

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
public interface IService<T> {
    public Boolean insert(T t);//001-010
    public Boolean update(Long id, T t);//011-020
    public Boolean delete(Long id);//021-030
    public T findById(Long id);//031-040
    public List<T> findByParam(String value, String columnName);//041-050
    public void printToExcel(String value,String columnName);//051-060
}
