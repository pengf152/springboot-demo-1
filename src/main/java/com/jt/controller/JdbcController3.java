package com.jt.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:/properties/jdbc.properties")
//@PropertySources({@PropertySource("classpath:/properties/jdbc.properties"}))
public class JdbcController3 {

    @Value("${jdbc3.name}")
    private String name;
    @Value("${jdbc3.jdbcDriver}")
    private String jdbcDriver;

    @RequestMapping("/jdbc3")
    public  String jdbcMsg(){
        return name+":"+jdbcDriver;
    }
}
