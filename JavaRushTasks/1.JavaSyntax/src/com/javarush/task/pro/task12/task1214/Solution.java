package com.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Останется только Java
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        removeAllWithoutJava();
        System.out.println(programmingLanguages.size());
        //напишите тут ваш код
    }
    static void removeAllWithoutJava(){
        programmingLanguages.removeIf(element -> !element.equals("Java"));
    }
}
