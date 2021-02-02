package com.javarush.task.task19.task1911;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Locale;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try( ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
             PrintStream printStream=new PrintStream(byteArrayOutputStream);
             PrintStream consoleOut=System.out) {
            System.setOut(printStream);
            testString.printSomething();
            String result=byteArrayOutputStream.toString().toUpperCase();
            System.setOut(consoleOut);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
