package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             PrintStream systemOut = System.out;
             PrintStream printStream = new PrintStream(byteArrayOutputStream)) {
            System.setOut(printStream);
            testString.printSomething();
            System.setOut(systemOut);
            String inputData = byteArrayOutputStream.toString();
            String[] symbols = inputData.split(" ");
            Integer result=0;
            switch (symbols[1]) {
                case "+":
                    result = Integer.valueOf(symbols[0]) + Integer.valueOf(symbols[2]);
                    break;
                case "-":
                    result = Integer.valueOf(symbols[0]) - Integer.valueOf(symbols[2]);
                    break;
                case "*":
                    result = Integer.valueOf(symbols[0]) * Integer.valueOf(symbols[2]);
            }

            System.out.print(symbols[0] + " " + symbols[1] + " " + symbols[2] + " = " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

