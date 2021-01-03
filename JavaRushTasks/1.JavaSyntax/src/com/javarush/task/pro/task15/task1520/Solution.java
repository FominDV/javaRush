package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

/* 
Глубокое копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        Path path1=Path.of(scanner.nextLine());
        Path path2=Path.of(scanner.nextLine());
        Files.walk(path1).forEach(path -> {
            try {
                Files.copy(path,path2.resolve(path1.relativize(path)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        //напишите тут ваш код
    }
}

