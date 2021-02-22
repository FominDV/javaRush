package com.javarush.task.task31.task3107;

import java.io.File;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Statement;

/* 
Null Object Pattern
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Class.class);
        Statement.execute();
    }
    private FileData fileData;

    public Solution(String pathToFile) {

        try {
            Path path = Paths.get(pathToFile);
            fileData = new ConcreteFileData(Files.isHidden(path), Files.isExecutable(path), Files.isDirectory(path), Files.isWritable(path));
        } catch (Exception e) {
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {

        return fileData;
    }
}
