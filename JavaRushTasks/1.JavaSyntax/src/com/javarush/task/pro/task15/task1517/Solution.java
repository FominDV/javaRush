package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        Path path1=Path.of(scanner.nextLine());
        Path path2=Path.of(scanner.nextLine());
        if(Files.notExists(path1)) Files.createFile(path1);
        else if(Files.notExists(path2)) Files.move(path1,path2);
        else Files.delete(path1);
        //напишите тут ваш код
    }
}

