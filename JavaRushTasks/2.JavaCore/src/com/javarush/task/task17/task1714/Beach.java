package com.javarush.task.task17.task1714;

/* 
Comparable
*/

import java.util.Comparator;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        System.out.println(new Beach("1",1.003f,1).compareTo(new Beach("1",1.0f,1)));
    }


    @Override
    public synchronized int compareTo(Beach o) {
        return quality-o.getQuality()+(int)(distance*100-o.getDistance()*100);
    }
}
