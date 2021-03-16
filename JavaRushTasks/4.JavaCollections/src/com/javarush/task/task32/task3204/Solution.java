package com.javarush.task.task32.task3204;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {
    private static List<String> passwordList = new ArrayList<>();

    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasDigit = false, hasSmallLetter = false, hasBigLetter = false;
        Random random = new Random(System.currentTimeMillis());
        int code;
        while (true) {
            for (int i = 0; i < 8; i++) {
                if ((code = getRandomCharCode(random)) < 65) {
                    hasDigit = true;
                } else if (code < 97) {
                    hasBigLetter = true;
                } else {
                    hasSmallLetter = true;
                }
                byteArrayOutputStream.write(code);
            }
            if (hasDigit == true && hasBigLetter == true && hasSmallLetter == true && !passwordList.contains(byteArrayOutputStream.toString())) {
                passwordList.add(byteArrayOutputStream.toString());
                return byteArrayOutputStream;
            } else {
                hasDigit = false;
                hasSmallLetter = false;
                hasBigLetter = false;
                byteArrayOutputStream.reset();
            }
        }
    }

    private static int getRandomCharCode(Random random) {
        return random.nextBoolean() ? random.nextInt(10) + 48 : getCodeOfLetter(random);
    }

    private static int getCodeOfLetter(Random random) {
        int code = random.nextInt(26);
        return random.nextBoolean() ? code + 65 : code + 97;
    }
}
