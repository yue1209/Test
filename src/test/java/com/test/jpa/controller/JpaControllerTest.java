package com.test.jpa.controller;

import com.test.jpa.JpaApplication;
import com.test.jpa.JpaApplicationTests;
import com.test.jpa.Pojo.Jpa_User;
import com.test.jpa.dao.JpaRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class JpaControllerTest {
    private  static JpaRepository jpa;
    @BeforeClass
    public static void setUp() throws Exception {
        ConfigurableApplicationContext run = SpringApplication.run(JpaApplication.class);
        jpa= run.getBean(JpaRepository.class);
    }

    @Test
    public void getString() throws Exception {
        List<Jpa_User> all = jpa.findAll();
        all.contains(1);
        for(int i=0;i<all.size();i++){
            System.out.println(all.get(i).getPass());
        }
    }

    @Test
    public void addJpaUser() throws Exception {
    }

    @Test
    public void updJpaUser() throws Exception {
    }

    @Test
    public void del() throws Exception {
    }

    @Test
    public void queryAll() throws Exception {
    }

    @Test
    public void queryAllByPage() throws Exception {
    }

}