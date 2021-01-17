package com.javarush.task.task17.task1721;

<<<<<<< HEAD
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
>>>>>>> 3cbf8e0... level 17

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
<<<<<<< HEAD
       fillLists();
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
    static void fillLists(){
        Scanner scanner=new Scanner(System.in);
        try(BufferedReader bufferedReader1=new BufferedReader(new FileReader(scanner.nextLine()));
            BufferedReader bufferedReader2=new BufferedReader(new FileReader(scanner.nextLine()))) {
            while (bufferedReader1.ready()){
                allLines.add(bufferedReader1.readLine());
            }
            while (bufferedReader2.ready()){
                forRemoveLines.add(bufferedReader2.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
=======
    }

    public void joinData() throws CorruptedDataException {

>>>>>>> 3cbf8e0... level 17
    }
}
