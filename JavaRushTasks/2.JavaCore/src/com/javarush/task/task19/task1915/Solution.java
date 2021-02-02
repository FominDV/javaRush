package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(byteArrayOutputStream);
        PrintStream systemOut=System.out;
        FileOutputStream fileOutputStream=new FileOutputStream(bufferedReader.readLine())){
            System.setOut(printStream);
            testString.printSomething();
            System.setOut(systemOut);
            String result=byteArrayOutputStream.toString();
            System.out.println(result);
            fileOutputStream.write(result.getBytes());
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

