package com.test.jpa.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName JpaUser
 * @Author yue
 * @Date 2018/8/22 : 14:15
 **/
@Entity
public class Jpa_User {
    private int id;
    private String name;
    private String pass;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Jpa_User(int id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }
    public Jpa_User() {
    }
    @Override
    public String toString() {
        return "JpaUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
