package com.SpringCoreConcept.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@ConditionalOnProperty(name = "db.type", havingValue = "posgres")
public class PostGresDatababse implements  DataBase{
    @Override
    public void save(String user) {
        System.out.println(" posg user: " + user);
    }
}
