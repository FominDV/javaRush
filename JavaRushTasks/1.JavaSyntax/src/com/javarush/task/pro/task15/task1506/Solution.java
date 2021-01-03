package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        try (var scanner=new Scanner(System.in)){
            List<String> lines=Files.readAllLines(Path.of(scanner.nextLine()));
            for(var line:lines){
                for(char c: line.toCharArray()){
                    if(c!=','&&c!='.'&&c!=' ')
                    System.out.print(c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //напишите тут ваш код
    }
}

