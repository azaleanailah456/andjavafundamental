package com.and.Oop.impl;

import com.and.Oop.IService;
import com.and.Oop.model.Department;

import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 12, 2023
@Author PT.DIKA Azalea Nailah Darmawan
Java Developer
Created on 17/09/2024 21:48
@Last Modified 17/09/2024 21:48
Version 1.0
*/
public class DepartmentService implements IService<Department> {

    @Override
    public Boolean insert(Department department) {
//        validasi
        if(department == null){
            System.out.println("Department is null H01V001");
        }
//        500 -> errorCode :

        //validasi
        if(department.getId() == 1212L){
            System.out.println("Department is null H01V002");
        }

        try{

        }catch(Exception e){
            System.out.println(" Error H01E001 "+e.getMessage());
        }

        return true;
    }

    @Override
    public Boolean update(Long id, Department department) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Department findById(Long id) {
        return null;
    }

    @Override
    public List<Department> findByParam(String value, String columnName) {
        return List.of();
    }

    @Override
    public void printToExcel(String value, String columnName) {

    }}
