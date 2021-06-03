package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.stream.Collectors;

/* 
Десериализация JSON объекта
*/

public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        String json;
        ObjectMapper objectMapper = new ObjectMapper();
        try(FileReader fileReader = new FileReader(fileName)){
            return objectMapper.readValue(fileReader, clazz);
        }
     //  return objectMapper.readValue(json, clazz);
    }

    public static void main(String[] args) {
        try {
            convertFromJsonToNormal(
                    "C:\\Geek_Brains\\javaRush\\javaRush\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task33\\task3303\\ee.txt",
                    String.class
                    );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
