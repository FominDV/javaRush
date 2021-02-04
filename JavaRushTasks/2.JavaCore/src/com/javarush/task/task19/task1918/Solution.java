package com.javarush.task.task19.task1918;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/
//C:\Geek_Brains\javaRush\javaRush\JavaRushTasks\2.JavaCore\src\com\javarush\task\task19\task1917\text.txt
public class Solution {
    public static void main(String[] args) {
        args = new String[]{"span"};
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()))) {
            String openingTeg = "<" + args[0];
            String closingTeg = "</" + args[0] + ">";
            String text = "";
            while (reader.ready())
                text += reader.readLine();
            text = text.replaceAll("[\r\n]", "");
            String[] partsOfTeg = text.split(openingTeg);
//            List<String> list = new ArrayList<>();
//            for (int i = 0; i < partsOfTeg.length; i++) {
//                if (partsOfTeg[i].contains(closingTeg)) {
//                    if(partsOfTeg.equals(closingTeg)){list.add(partsOfTeg[i]); break;}
//                   String[] miniParts=partsOfTeg[i].split(closingTeg);
//                   for(int j=0;j<miniParts.length;j++){
//                       if(miniParts[j].equals("")) break;
//                       miniParts[j]+=closingTeg;
//                       list.add(miniParts[j]);
//                   }
//                } else {
//                    list.add(partsOfTeg[i]);
//                }
//            }
//            partsOfTeg=new String[list.size()];
//            for (int i = 0; i < partsOfTeg.length; i++) {
//                partsOfTeg[i]=list.get(i);
//            }
            ////////////////
            String currentPart;
            int countOfNestedTeg;
            int length = partsOfTeg[partsOfTeg.length - 1].contains(closingTeg) ? partsOfTeg.length : partsOfTeg.length - 1;
            for (int i = 1; i < length; i++) {
                countOfNestedTeg = 0;
                currentPart = "";
                label:
                for (int j = i; j < length; j++) {
                    // currentPart += openingTeg + partsOfTeg[j];
                    if (partsOfTeg[j].contains(closingTeg)) {
                        /////////////////
                        if (partsOfTeg[j].equals(closingTeg)) {
                            currentPart += openingTeg + partsOfTeg[j];
                            break;
                        }
                        String[] miniParts = partsOfTeg[j].split(closingTeg);
                        for (int k = 0; k < miniParts.length; k++) {
                            currentPart += openingTeg + miniParts[k] + closingTeg;
                            if (countOfNestedTeg == 0) {
                                 break label;
                            } else{  countOfNestedTeg--;}
                        }
                    } else {
                        currentPart += openingTeg + partsOfTeg[j];
                        countOfNestedTeg++;
                    }
                }
                System.out.println(currentPart);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}