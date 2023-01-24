# Jackson CSV to JSON converter 

Java project using the Jackson library to read a csv file and deserialize into a Java object. These are then persisted
to a target file, again using Jackson to serialize the object into a json string.  

## How to run 

### Create text files and source/target directories

CSV file should be in the following format  

```
id,name,age,favouriteFruit,money
1,Ann,30,ORANGE,10001.22
3,Tom,27,BANANA,400.99
```
Two directories should be created in the same location as the
project:
```
java-csv-to-json/
TargetFiles/
SoureFiles/
   ├─ csvFile1.csv
```

### IntelliJ

1. Clone project
2. Open project using IntelliJ
3. Build Maven project
4. Run com.example.csvtojson.CsvToJson



