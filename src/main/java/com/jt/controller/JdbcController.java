package com.jt.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {

    @Value("${jdbc.name}")
    private String name;
    @Value("${jdbc.jdbcDriver}")
    private String jdbcDriver;

    @RequestMapping("/jdbc")
    public  String jdbcMsg(){
        return name+":"+jdbcDriver;
    }
}
