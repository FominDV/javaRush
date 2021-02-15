package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        File rootDirectory=new File(root);
        getFiles(rootDirectory,list);
        return list;
    }
private static void getFiles(File rootDirectory, List<String> list){
    for(File file:rootDirectory.listFiles()){
        if(file.isFile()){
            list.add(file.getAbsolutePath());
        }else {
            getFiles(file,list);
        }
    }
}
    public static void main(String[] args) throws IOException {
//      List<String> ls = getFileTree("C:\\Geek_Brains\\html.css\\homeWork\\HTML.CSS\\homework");
//        System.out.println(ls);
    }
}
