package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader=new FileReader(scanner.readLine());
        FileWriter fileWriter=new FileWriter(scanner.readLine())) {
            boolean evenNumber=false;
            int currentChar;
            while ((currentChar=fileReader.read())!=-1){

                fileWriter.write(fileReader.read());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
