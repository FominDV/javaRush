package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader=new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer=new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {
            StringBuilder dataFile=new StringBuilder();
            while (reader.ready())
                dataFile.append(reader.readLine());
            writer.write(dataFile.toString().replace('.','!'));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
