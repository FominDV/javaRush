package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            String line;
            StringBuilder result=new StringBuilder();
            while ((line = reader.readLine()) != null) {
                String[] words=line.split(" ");
                for(String word:words){
                    if(word.length()>6) result.append(word+",");
                }
            }
            result.deleteCharAt(result.length()-1);
            writer.write(result.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
