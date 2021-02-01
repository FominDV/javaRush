package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader=new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer=new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {
            StringBuilder data=new StringBuilder();
            while (reader.ready()) data.append(reader.readLine());
            writer.write(data.toString().replaceAll("[\\p{Punct}\\n]",""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
