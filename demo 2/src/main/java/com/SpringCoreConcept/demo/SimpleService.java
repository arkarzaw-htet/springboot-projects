package com.SpringCoreConcept.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    DataBase dataBase;
    public SimpleService(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public void saveUser(String user){
        System.out.println(" 2 Saving user: " + user);
        dataBase.save(user);
    }
}
