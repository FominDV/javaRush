package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args)  {
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader= new BufferedReader(new FileReader(bufferedReader.readLine()));
            BufferedWriter fileWriter= new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {
            StringBuilder dataFile=new StringBuilder();
            while (fileReader.ready())
                dataFile.append( fileReader.readLine());
            for(String word: dataFile.toString().split("[\\s]")){
                if(word.matches("\\d+"))
                    fileWriter.write(word+" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
