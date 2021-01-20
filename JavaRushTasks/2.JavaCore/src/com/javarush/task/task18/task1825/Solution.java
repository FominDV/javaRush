package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        try {
            buildFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void buildFile() throws IOException {
        Map<String, BufferedInputStream> partsTreeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String fileName, newFileName=null;
        while (!(fileName = scanner.nextLine()).equals("end")) {
            partsTreeMap.put(fileName, new BufferedInputStream(new FileInputStream(fileName)));
            if(newFileName==null) newFileName=fileName.substring(0, fileName.indexOf(".part"));
        }
        scanner.close();
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream(newFileName));
        for(BufferedInputStream inputStream:partsTreeMap.values()){
            while (inputStream.available()>0)
                outputStream.write(inputStream.read());
            inputStream.close();
        }
        outputStream.close();
    }

}
