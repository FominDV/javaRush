package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.Scanner;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) {
        if(args.length!=1) throw new RuntimeException();
        try(BufferedReader reader=new BufferedReader(new FileReader(new Scanner(System.in).nextLine()))) {
            String line;
            while ((line=reader.readLine())!=null){
                if(line.split(" ")[0].equals(args[0])){
                    System.out.println(line);
                    return;
                }
               // System.out.println("id was not found");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
