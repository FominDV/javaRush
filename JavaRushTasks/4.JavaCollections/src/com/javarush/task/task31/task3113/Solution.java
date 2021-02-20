package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

public class Solution {

    private static int countOfDirectories = -1;
    private static int countOfFiles;
    private static long countOfBites;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(scanner.nextLine());
        if (!Files.isDirectory(path)) {
            System.out.println(path.toString() + " - не папка");
            return;
        }
        Files.walkFileTree(path, new FileVisitor());
        System.out.printf("Всего папок - %d\n" +
                        "Всего файлов - %d\n" +
                        "Общий размер - %d",
                countOfDirectories, countOfFiles, countOfBites);
    }

    static class FileVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            countOfDirectories++;
            return super.preVisitDirectory(dir, attrs);
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            countOfFiles++;
            countOfBites += attrs.size();
            return super.visitFile(file, attrs);
        }
    }
}
