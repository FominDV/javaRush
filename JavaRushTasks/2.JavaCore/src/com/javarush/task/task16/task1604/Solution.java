package com.javarush.task.task16.task1604;

/* 
Вывод стек-трейса
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement[] element : Thread.getAllStackTraces().values()) {
            for(StackTraceElement element1: element)
            System.out.println(element1);
        }
    }
    public static class SpecialThread implements Runnable{

        @Override
        public void run() {
//            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
//                System.out.println(element);
//            }
        }
    }
}
