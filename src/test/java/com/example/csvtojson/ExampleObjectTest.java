package com.example.csvtojson;

import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.example.csvtojson.ExampleObject.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleObjectTest {

    static ExampleObject testObject;

    @BeforeAll
    static void setup() {
        testObject = new ExampleObject();
        testObject.id = Long.valueOf(123456789);
        testObject.name = "Daenerys Targaryen";
        testObject.age = 24;
        testObject.favouriteFruit = Fruit.valueOf("APPLE");
        testObject.money = BigDecimal.valueOf(1000000000.00);

    }

    @Test
    void testToString() {
        final String expected = "ExampleObject{" +
                "id=123456789, " +
                "name='Daenerys Targaryen', " +
                "age=24, " +
                "favouriteFruit=APPLE, " +
                "money=1000000000.00" +
                "}";

        assertEquals(expected, testObject.toString());

    }
}