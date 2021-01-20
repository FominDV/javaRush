package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;



/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        readFileNames();
    }
private static void readFileNames(){
        Scanner scanner=new Scanner(System.in);
        String fileName;
        while (!((fileName=scanner.nextLine()).equals("exit")))
            new ReadThread(fileName);
        scanner.close();
}
    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName=fileName;
            start();
        }

        @Override
        public void run() {
            try(BufferedInputStream in=new BufferedInputStream(new FileInputStream(fileName))) {
                byte[] bytes=new byte[256];
                byte currentByte;
                while ((currentByte=(byte) in.read())!=-1){
                    bytes[currentByte]++;
                }
                int indexOfPopularByte=0;
                for (int i = 1; i < bytes.length; i++) {
                    if(bytes[i]>bytes[indexOfPopularByte]) indexOfPopularByte=i;
                }
                resultMap.put(fileName, indexOfPopularByte);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
