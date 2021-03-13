package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw")) {
            long position = Long.parseLong(args[1]);
            byte[] bytes = new byte[args[2].length()];
            randomAccessFile.seek(position);
            randomAccessFile.read(bytes,0,bytes.length);
            String response = new String(bytes).equals(args[2]) ? "true" : "false";
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(response.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
