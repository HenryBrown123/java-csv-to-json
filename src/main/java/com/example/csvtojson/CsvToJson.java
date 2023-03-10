package com.example.csvtojson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToJson {

    public static void main(String[] args) throws IOException {

        // source and target directories for csv and json files.. best to store these in
        // configuration files
        String sourceDir = "/Users/henrybrown/JavaCode/SourceFiles/";
        String targetDir = "/Users/henrybrown/JavaCode/TargetFiles/";

        String sourceFileName = "csvFile1.csv";
        String targetFileName = "jsonFile1.json";

        // instantiate File objects for file io
        File csvFile = new File(sourceDir + sourceFileName);
        File jsonFile = new File(targetDir + targetFileName);

        System.out.println("\nReading csv file and storing as a list of java objects");
        List<DataObject> dataObjects = readObjectsFromCsv(csvFile);

        System.out.println("Printing java objects read from csv file using toString() override\n");
        dataObjects.forEach(System.out::println);

        System.out.println("\nWriting java objects to json file...");
        writeAsJson(dataObjects, jsonFile);

        System.out.println("\nReading json file and storing data as a list of java objects..\n");
        List<DataObject> jsonObjects = readObjectsFromJson(jsonFile);

        System.out.println("Printing java objects read from json file\n");
        jsonObjects.forEach(System.out::println);
    }

    public static List<DataObject> readObjectsFromCsv(File csvFile) throws IOException {
        // this creates the schema object that data from the csv file will be read into
        // essentially maps each line of the csv file to a java object
        CsvMapper csvMapper = new CsvMapper();

        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        // read data into an iterator so it can be returned as a list
        MappingIterator<DataObject> exampleObjectIterator = csvMapper
                .readerWithTypedSchemaFor(DataObject.class)
                .with(schema)
                .readValues(csvFile);

        return exampleObjectIterator.readAll();
    }

    public static void writeAsJson(List<DataObject> data, File targetFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.writeValue(targetFile, data);
    }

    public static List<DataObject> readObjectsFromJson(File jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // https://northcoder.com/post/jackson-object-mapper-which-way-is/
        // Using TypeReference gives better control
        return mapper.readValue(jsonFile, new TypeReference<List<DataObject>>(){});
    }
}

