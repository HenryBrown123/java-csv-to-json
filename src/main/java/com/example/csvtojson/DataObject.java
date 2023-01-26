package com.example.csvtojson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
*
 */

public class DataObject {

    public Map<String, Object> data = new LinkedHashMap<>();
    public DataObject() {
    }

    /**
     * Method utilised by Jackson library to read json and set properies on object
     * @param key
     * @param value
     */
    @JsonAnySetter
    public void setData(String key, Object value) {
        data.put(key, value);
    }

    /**
     *  Method utilised by Jackson library for reading object properties and writing to json
     * @return
     */
    @JsonAnyGetter
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * Override method for returning object as a string for logging
     * @return
     */
    @Override
    public String toString() {
        return "DataObject" +
                data.toString();
    }
}