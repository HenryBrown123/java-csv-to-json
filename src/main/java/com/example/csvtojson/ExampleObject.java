package com.example.csvtojson;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

/**
*
 */

@JsonPropertyOrder({"id", "name", "age", "favouriteFruit", "amount"})
public class ExampleObject {

    enum Fruit {
        APPLE, BANANA, ORANGE
    }

    private Long id;
    private String name;
    private Integer age;
    private Fruit favouriteFruit;
    private BigDecimal money;

    public ExampleObject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Fruit getFavouriteFruit() {
        return favouriteFruit;
    }

    public void setFavouriteFruit(Fruit favouriteFruit) {
        this.favouriteFruit = favouriteFruit;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ExampleObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", favouriteFruit=" + favouriteFruit +
                ", money=" + money +
                '}';
    }
}