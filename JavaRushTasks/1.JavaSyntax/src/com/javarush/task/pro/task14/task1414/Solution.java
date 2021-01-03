package com.javarush.task.pro.task14.task1414;

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (int i = 0; i < stackTrace.length; i++) {
            StackTraceElement currentStackTraceElement = stackTrace[i];
            System.out.printf(OUTPUT_FORMAT, currentStackTraceElement.getMethodName(), currentStackTraceElement.getLineNumber(), currentStackTraceElement.getClassName(), currentStackTraceElement.getFileName());
        }

        //напишите тут ваш код
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
