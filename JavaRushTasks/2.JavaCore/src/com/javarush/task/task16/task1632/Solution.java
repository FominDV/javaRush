package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
threads.get(1).start();
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
        while (true){

        }
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {

                try {
                   throw new InterruptedException();
                }catch (InterruptedException e){
                    System.out.println(e);
                }

        }
    }
    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
            while (!isInterrupted()){}
        }

        @Override
        public void showWarning() {
            if(isAlive()) interrupt();
        }
    }
    public static class Thread5 extends Thread {
        @Override
        public void run() {
            Scanner scanner=new Scanner(System.in);
            String inputLine;
            double sum=0.0;
            while (!((inputLine=scanner.nextLine()).equals("N"))){
                try {
                    sum+=Double.parseDouble(inputLine);
                }catch (NumberFormatException e){

                }
            }
            System.out.println(sum);
        }
    }
}
