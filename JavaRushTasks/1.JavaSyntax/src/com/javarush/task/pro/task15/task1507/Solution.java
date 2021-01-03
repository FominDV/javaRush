package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)) {
            var lines=Files.readAllLines(Path.of(scanner.nextLine()));
            for (int i = 0; i < lines.size(); i+=2) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //напишите тут ваш код
    }
}

