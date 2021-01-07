package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner=new Scanner(System.in);
             FileInputStream in0=new FileInputStream(scanner.nextLine());
             BufferedReader reader=new BufferedReader(new InputStreamReader(in0))){
            while (reader.ready()){
                System.out.println(reader.readLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }
        // напишите тут ваш код
    }
}