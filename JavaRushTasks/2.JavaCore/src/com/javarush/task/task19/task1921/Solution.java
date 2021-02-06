package com.javarush.task.task19.task1921;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            String line, name;
            Date date;
            while ((line=reader.readLine())!=null){
                StringBuilder stringBuilder = new StringBuilder();
                String[] data = line.split(" ");
                int lengthOfData=data.length;
                for (int i = 0; i <lengthOfData-3 ; i++) {
                    stringBuilder.append(data[i]);
                    if(i!=lengthOfData-4) stringBuilder.append(" ");
                }
                name=stringBuilder.toString();
                date=new Date(Integer.valueOf(data[lengthOfData-1])-1900,Integer.valueOf(data[lengthOfData-2])-1,Integer.valueOf(data[lengthOfData-3]));
                PEOPLE.add(new Person(name,date));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
