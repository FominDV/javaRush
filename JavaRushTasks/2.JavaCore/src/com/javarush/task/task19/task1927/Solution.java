package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();
    public static final String contextAdvertisement="JavaRush - курсы Java онлайн";
    public static void main(String[] args) {
        PrintStream systemOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        boolean isEvenLine = true;
        testString.printSomething();
        System.setOut(systemOut);
        for (String line : byteArrayOutputStream.toString().split("\\n")) {
            isEvenLine = isEvenLine ? false : true;
            System.out.println(line);
            if(isEvenLine) System.out.println(contextAdvertisement);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
