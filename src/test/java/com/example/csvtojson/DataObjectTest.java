package com.example.csvtojson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.example.csvtojson.DataObject.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DataObjectTest {

    static DataObject testObject;

    @BeforeAll
    static void setup() {
        testObject = new DataObject();
        Map<String, Object> testData = new LinkedHashMap<>();
        testData.put("id","123456789");
        testData.put("name","'Daenerys Targaryen'");
        testData.put("age","24");
        testData.put("favouriteFruit","'Dragon Egg'");
        testData.put("money","1000000000.00");
        testObject.data = testData;

    }

    @Test
    void testToString() {
        final String expected = "DataObject{" +
                "id=123456789, " +
                "name='Daenerys Targaryen', " +
                "age=24, " +
                "favouriteFruit='Dragon Egg', " +
                "money=1000000000.00" +
                "}";

        assertEquals(expected, testObject.toString());

    }
}