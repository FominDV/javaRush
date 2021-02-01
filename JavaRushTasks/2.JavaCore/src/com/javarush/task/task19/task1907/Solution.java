package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(bufferedReader.readLine())) {
            String fileData = "";
            int countWords=0;
            while (fileReader.ready())
                fileData += (char)fileReader.read();
            String[] words=fileData.split("[\\W_]");
            for(String word: words)
                if(word.equals("world")) countWords++;
            System.out.println(countWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
