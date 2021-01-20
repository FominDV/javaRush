package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Scanner;

/* 
Округление чисел
*/
//  C:\Geek Brains\javaRush\javaRush\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1827\t.txt
public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             BufferedReader reader = new BufferedReader(new FileReader(scanner.nextLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(scanner.nextLine(),true))) {
            String[] numbers = reader.readLine().split(" ");
            aroundNumbers(numbers);
            for(String number: numbers) writer.write(number+" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void aroundNumbers(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= String.valueOf(Math.round(Double.parseDouble(numbers[i])));
        }
    }
}
