package com.javarush.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
<<<<<<< HEAD
            synchronized (notes){
            notes.add(index, note);}
=======
            notes.add(index, note);
>>>>>>> 3cbf8e0... level 17
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
<<<<<<< HEAD
            String note=null;
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            synchronized (notes){
            note = notes.remove(index);}
=======
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
>>>>>>> 3cbf8e0... level 17
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }

}
