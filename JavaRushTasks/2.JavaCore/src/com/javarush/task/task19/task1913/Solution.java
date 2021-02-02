package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try(ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(byteArrayOutputStream);
        PrintStream systemOut=new PrintStream(System.out)){
            System.setOut(printStream);
            testString.printSomething();
            System.setOut(systemOut);
            System.out.println(byteArrayOutputStream.toString().replaceAll("\\D",""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
