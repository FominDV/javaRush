package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        String url=new Scanner(System.in).nextLine();
       String[] params=url.substring(url.lastIndexOf('?')+1).split("&");
       StringBuilder builder=new StringBuilder();
       Object object=null;
       for(String param:params){
           String[] partsOfParam=param.split("=");
           builder.append(partsOfParam[0]+" ");
           if(partsOfParam[0].equals("obj")){
               try {
                   object=Double.parseDouble(partsOfParam[1]);
               } catch (NumberFormatException e) {
                   object=partsOfParam[1];
               }
           }
       }
        System.out.println(builder);
        if(object!=null){
            if(object instanceof Double) alert((Double)object); else alert(object.toString());
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
