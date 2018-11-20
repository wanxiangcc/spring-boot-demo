package com.boot.demo.interfaces.impl;

import com.boot.demo.interfaces.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("db-dev")
public class DevDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("db-dev");
    }
}
