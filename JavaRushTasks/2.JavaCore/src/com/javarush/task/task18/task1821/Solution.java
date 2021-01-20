package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {

        public static void main(String[] args) throws IOException {
            int[] aSCII = new int[128];
            try (FileReader reader = new FileReader(args[0])) {
                while (reader.ready()) {
                    aSCII[reader.read()]++;
                }
            }
            for (int i = 0; i < aSCII.length; i++) {
                if (aSCII[i] != 0) {
                    System.out.println((char) i + " " + aSCII[i]);
                }
            }
        }
}
