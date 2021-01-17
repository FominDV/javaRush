package com.javarush.task.task17.task1704;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки 2
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

<<<<<<< HEAD
        public synchronized void addNote(int index, String note) {
=======
        public void addNote(int index, String note) {
>>>>>>> 3cbf8e0... level 17
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

<<<<<<< HEAD
        public synchronized void removeNote(int index) {
=======
        public void removeNote(int index) {
>>>>>>> 3cbf8e0... level 17
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}
