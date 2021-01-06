package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static ArrayList<Keyboard> keyboardOrchestra = new ArrayList<>();
    static ArrayList<Stringed> stringedOrchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playKeyboardOrchestra();
        playStringedOrchestra();
    }


    public static void createKeyboardOrchestra(){
        for (int i=0;i<3;i++) {
            keyboardOrchestra.add(new Piano());
        }
        keyboardOrchestra.add(new Organ());
        //напишите тут ваш код
    }

    public static void createStringedOrchestra(){
        for (int i = 0; i <2 ; i++) {
            stringedOrchestra.add(new Violin());
        }
        stringedOrchestra.add(new Guitar());
        //напишите тут ваш код
    }

    public static void playKeyboardOrchestra(){
        keyboardOrchestra.forEach(keyboard -> keyboard.playKeys());
        //напишите тут ваш код
    }


    public static void playStringedOrchestra(){
        stringedOrchestra.forEach(keyboard -> keyboard.playStrings());
        //напишите тут ваш код
    }

}
