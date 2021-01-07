package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        try(InputStream inputStream=new FileInputStream(new Scanner(System.in).nextLine());
       Scanner scanner=new Scanner(inputStream)) {
            List<Integer> list=new ArrayList<>();
            while (scanner.hasNextInt()) list.add(scanner.nextInt());
            list.stream().filter(number->number%2==0).sorted(Integer::compare).forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
        // напишите тут ваш код
    }
}
