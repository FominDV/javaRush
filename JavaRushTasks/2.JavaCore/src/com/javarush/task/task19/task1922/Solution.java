package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader=new BufferedReader(new FileReader(bufferedReader.readLine()))){
            String line;
            while ((line=reader.readLine())!=null){
                String[] wordsFromLine=line.split(" ");
                int countOfWords=0;
                for(String word: wordsFromLine){
                    if(words.contains(word)) countOfWords++;
                }
                if(countOfWords==2) System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
