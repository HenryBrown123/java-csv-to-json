package com.example.csvtojson;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.StringBufferInputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
*
 */

@JsonPropertyOrder({"id", "name", "age", "favouriteFruit", "money"})
public class ExampleObject {

    enum Fruit {
        APPLE, BANANA, ORANGE
    }

    public Long id;
    public String name;
    public Integer age;
    public Fruit favouriteFruit;
    public BigDecimal money;

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
                "id=" + id.toString() +
                ", name='" + name + '\'' +
                ", age=" + age.toString() +
                ", favouriteFruit=" + favouriteFruit +
                ", money=" + new DecimalFormat("#.00").format(money) +
                '}';
    }
}