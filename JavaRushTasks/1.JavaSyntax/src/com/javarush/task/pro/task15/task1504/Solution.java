package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream in = Files.newInputStream(Path.of(scanner.nextLine()));
             OutputStream out=Files.newOutputStream(Path.of(scanner.nextLine()))) {
            byte[] buffer=in.readAllBytes();
            byte bufferByte=0;
            int lengthBinary=buffer.length-buffer.length/2;
            for (int i = 0; i < lengthBinary; i+=2) {
                bufferByte=buffer[i+1];
                buffer[i+1]=buffer[i];
                buffer[i]=bufferByte;
            }

            out.write(buffer);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
        //напишите тут ваш код
    }
}

