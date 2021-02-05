package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line, name;
            Double value;
            Map<String, Double> mapName = new TreeMap<>();
            while ((line = reader.readLine()) != null) {
                String[] paramsOfLine = line.split(" ");
                name = paramsOfLine[0];
                value = Double.parseDouble(paramsOfLine[1]);
                if (mapName.containsKey(name)) mapName.put(name, mapName.get(name) + value);
                else mapName.put(name, value);
            }
            for (Map.Entry<String,Double> entry : mapName.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
