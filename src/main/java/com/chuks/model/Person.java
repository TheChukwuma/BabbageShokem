package com.chuks.model;

import java.util.HashMap;

public class Person {
    private String name;
    private String role;
    private int age;
    private int id;
    private Double customerMoney;
    private HashMap<String, Long> cart;

   public Person(String name){
       this.name = name;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
