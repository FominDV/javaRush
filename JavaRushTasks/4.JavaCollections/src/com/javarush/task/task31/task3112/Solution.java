package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);
        Path tempFile = Files.createTempFile("temp", ".tmp");
        InputStream inputStream = url.openStream();
        Files.copy(inputStream, tempFile);
        Path name = Paths.get(urlString).getFileName();
        Path newFile = downloadDirectory.resolve(name);
        Files.move(tempFile, newFile);
        return newFile;
    }
}
