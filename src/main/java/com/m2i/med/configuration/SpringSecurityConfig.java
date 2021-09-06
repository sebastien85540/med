package com.m2i.med.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter {

    private DataSource dataSource;

    protected void configure(HttpSecurity http){

    }

}
