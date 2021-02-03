package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/
//C:\Geek_Brains\javaRush\javaRush\JavaRushTasks\2.JavaCore\src\com\javarush\task\task19\task1915\file1.txt
//C:\Geek_Brains\javaRush\javaRush\JavaRushTasks\2.JavaCore\src\com\javarush\task\task19\task1915\file2.txt
public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
             BufferedReader reader2 = new BufferedReader(new FileReader(bufferedReader.readLine()))) {
            String lineOfFirstFile = reader1.readLine(), lineOfSecondFile = reader2.readLine(), futureLine = "";
            boolean isNext = false;
            while (true) {
                if (lineOfFirstFile == null) {
                    if (lineOfSecondFile == null) {
                        break;
                    } else {
                        lines.add(new LineItem(Type.ADDED, lineOfSecondFile));
                        break;
                    }
                }
                if (lineOfSecondFile == null) {
                    lines.add(new LineItem(Type.REMOVED, lineOfFirstFile));
                    break;
                }

                if (lineOfFirstFile.equals(lineOfSecondFile)) {
                    lines.add(new LineItem(Type.SAME, lineOfFirstFile));
                    lineOfFirstFile = reader1.readLine();
                    if (isNext){ lineOfSecondFile = futureLine; isNext=false;}
                    else lineOfSecondFile = reader2.readLine();
                } else {
                    if (lineOfFirstFile.equals(futureLine = reader2.readLine())) {
                        lines.add(new LineItem(Type.ADDED, lineOfSecondFile));
                        lineOfSecondFile = futureLine;
                    } else {
                        isNext=true;
                        lines.add(new LineItem(Type.REMOVED, lineOfFirstFile));
                        lineOfFirstFile = reader1.readLine();
                    }
                }

            }
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
