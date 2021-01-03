package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0,s);
        //напишите тут ваш код
    }

    public String pop() {
        return storage.remove(0);
        //напишите тут ваш код
    }

    public String peek() {
        return storage.get(0);
        //напишите тут ваш код
    }

    public boolean empty() {
        return storage.isEmpty();
        //напишите тут ваш код
    }

    public int search(String s) {
        return storage.indexOf(s);
        //напишите тут ваш код
    }
}
