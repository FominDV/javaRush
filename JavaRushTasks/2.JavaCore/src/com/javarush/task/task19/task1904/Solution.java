package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line=fileScanner.nextLine();
            String[] dataParts=line.split(" ");
            return new Person(dataParts[1],dataParts[2],dataParts[0],new Date(Integer.valueOf(dataParts[5])-1900,Integer.valueOf(dataParts[4])-1,Integer.valueOf(dataParts[3])));
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
