package com.javarush.task.task25.task2515;

import java.util.ArrayList;
import java.util.List;

public class Space {

    private int width;
    private int height;
    private SpaceShip ship;
    private List<Bomb> bombs = new ArrayList<>();
    private List<Ufo> ufos = new ArrayList<>();
    private List<Rocket> rockets = new ArrayList<>();

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }

    public void run(){

    }

    public void draw(){

    }

    public void sleep(int ms){

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public List<Bomb> getBombs() {
        return bombs;
    }

    public List<Ufo> getUfos() {
        return ufos;
    }

    public List<Rocket> getRockets() {
        return rockets;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }
}
