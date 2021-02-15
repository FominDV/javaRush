package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) {
        String path = args[0];
        String resultFileAbsolutePath = args[1];
        File resultFile = new File(resultFileAbsolutePath);
        File dest = new File(resultFile.getParentFile() + "/allFilesContent.txt");
        if (FileUtils.isExist(dest)) {
            FileUtils.deleteFile(dest);
        }
        FileUtils.renameFile(resultFile, dest);
        Map<String, byte[]> map = new TreeMap<>();
        try (FileOutputStream outputStream =new FileOutputStream(dest)) {
            checkDirectory(new File(path), map);
            for (byte[] entry : map.values()) {
                outputStream.write(entry);
                outputStream.write("\n".getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void checkDirectory(File directory, Map<String, byte[]> map) throws IOException {
        for (File file: directory.listFiles()) {
            if(file.isFile()){
                if(file.length()<=50){
                 BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(file));
                byte[] bytes=new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bytes,0,bytes.length);
                    map.put(file.getName(),bytes);
                }
            }else {
                checkDirectory(file,map);
            }
        }
    }
}
