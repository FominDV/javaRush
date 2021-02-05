package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/
//C:\Geek_Brains\javaRush\javaRush\JavaRushTasks\2.JavaCore\src\com\javarush\task\task19\task1920\file.txt
public class Solution {
    public static void main(String[] args) {
      //  args = new String[]{"C:/Geek_Brains/javaRush/javaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1920/file.txt"};
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line, name;
            Double value;
            Map<String, Double> namesMap = new TreeMap<>();
            while ((line = reader.readLine()) != null) {
                String[] paramsOfLine = line.split(" ");
                name = paramsOfLine[0];
                value = Double.parseDouble(paramsOfLine[1]);
                if (namesMap.containsKey(name)) namesMap.put(name, namesMap.get(name) + value);
                else namesMap.put(name, value);
            }
            Double maxValue = 0.0;
            for (Double valueOfMap : namesMap.values()) {
                if (maxValue < valueOfMap) maxValue = valueOfMap;
            }
            for (Map.Entry<String, Double> entry : namesMap.entrySet()) {
                if (entry.getValue().equals(maxValue)) System.out.println(entry.getKey());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
