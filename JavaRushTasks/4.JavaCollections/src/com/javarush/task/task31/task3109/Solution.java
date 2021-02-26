package com.javarush.task.task31.task3109;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* 
Читаем конфиги
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) throws IOException {
        File file = new File(fileName);
        Properties properties = new Properties();
        if (!file.exists()) return properties;
        if (fileName.endsWith(".xml")) {
            properties.loadFromXML(new FileInputStream(file));
        } else {
            properties.load(new FileReader(file));
        }
        return properties;
    }
}
