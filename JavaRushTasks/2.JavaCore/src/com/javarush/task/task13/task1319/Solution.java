package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in);
        BufferedWriter writer=new BufferedWriter(new FileWriter(scanner.nextLine()))) {
            String line="";
            do{
                line=scanner.nextLine();
                writer.write(line+"\n");
            }while (!line.equals("exit"));
        }catch (IOException e){
            e.printStackTrace();
        }
        // напишите тут ваш код
    }
}
