package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        String inputString=new Scanner(System.in).nextLine();
       switch (inputString){
           case  "helicopter":result= new Helicopter(); break;
           case  "plane" : result= new Plane(12);
      }
       
        //add your code here - добавьте код тут
    }
}
