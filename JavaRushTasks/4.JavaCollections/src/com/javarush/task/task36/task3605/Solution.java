package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        TreeSet<Character> characters = new TreeSet<>();

        String s;
        while ((s = reader.readLine()) != null) {
            for (char ch : s.toLowerCase().toCharArray()) {
                if (ch >= 97 && ch <= 122)
                    characters.add(ch);
            }
        }

        reader.close();

        int count = 0;
        for (Character c : characters) {
            System.out.print(c);
            count++;
            if (count == 5) {
                break;
            }

        }
    }

    private static Stream<Character> getCharStream(String line) {
        char[] chars = line.toCharArray();
        Character[] characters = new Character[chars.length];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = Character.valueOf(chars[i]);
        }
        return Arrays.stream(characters);
    }

}
