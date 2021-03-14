package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        StringWriter stringWriter=new StringWriter();
        if(reader!=null){
            String line;
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null){
                  char[] bytes=new char[line.length()];
                  char[] lineChars=line.toCharArray();
                for (int i = 0; i < line.length(); i++) {
                    bytes[i]= (char) (lineChars[i]+key);
                }
                stringWriter.write(String.valueOf(bytes));
            }
            bufferedReader.close();
        }
        return stringWriter.toString();
    }
}
