package com.javarush.task.task25.task2515;

import java.util.Random;

public class Ufo extends BaseObject {

    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1},
    };

    public Ufo(double x, double y) {
        super(x, y, 3);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y - radius + 1, matrix, 'U');
    }

    public void move() {
        double dx = Math.random() * 2 - 1; //-1..1
        double dy = Math.random() * 2 - 1; //-1..1
        x += dx;
        y += dy;
        checkBorders(0, Space.game.getWidth(), 0, Space.game.getHeight() / 2);
        if (Math.random() < 0.1) {
            fire();
        }
    }

    public void fire() {
        Bomb bomb = new Bomb(x, y + radius);
        Space.game.getBombs().add(bomb);
    }

}
