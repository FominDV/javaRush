package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;
import java.util.Random;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        Random random=new Random();
        for (int i = 0; i < 5; i++) {
            grades.put(new String(new char[]{(char) ('A'+i), (char) ('B'+i)}),random.nextDouble()*3+2);
        }
        //напишите тут ваш код
    }
}
