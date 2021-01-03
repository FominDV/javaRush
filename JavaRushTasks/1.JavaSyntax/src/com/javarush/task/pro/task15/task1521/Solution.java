package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        URL url=new URL(scanner.nextLine());
        try {
            InputStream in=url.openStream();
            byte[] bytes=in.readAllBytes();
            Files.write(Files.createFile(Path.of("C:\\Geek Brains\\Java_homework\\Java-3\\file.txt")),bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //напишите тут ваш код
    }
}