package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        printSomething(args[0]);
        String result = outputStream.toString();
        byte[] bytes=result.getBytes();
        outputStream.reset();
        for (int i = bytes.length-1; i >=0  ; i--) {
            outputStream.write(bytes[i]);
        }
        System.out.println(outputStream.toString());
        //напишите тут ваш код
    }
    public static void printSomething(String str) throws IOException {
        stream.write(str.getBytes());
    }
}