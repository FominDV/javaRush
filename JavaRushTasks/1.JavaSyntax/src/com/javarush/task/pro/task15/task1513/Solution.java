package com.javarush.task.pro.task15.task1513;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Зри в корень
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)) {
            System.out.println(Path.of(scanner.nextLine()).getRoot());
        }
        //напишите тут ваш код
    }
}

