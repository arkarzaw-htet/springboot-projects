package com.SpringCoreConcept.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@ConditionalOnProperty(name = "db.type", havingValue = "mysql")
public class MySqlDatabase  implements DataBase{

    @Override
    public void save(String user) {
        System.out.println(" mysql user: " + user);

    }
}
