package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection=url.openConnection();
        connection.setDoOutput(true);

        try(OutputStream outputStream=connection.getOutputStream();
            PrintStream out=new PrintStream(outputStream);
            BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            out.println("HI");
            while (in.ready()){
                System.out.println(in.readLine());
            }
        }

        //напишите тут ваш код
    }
}

