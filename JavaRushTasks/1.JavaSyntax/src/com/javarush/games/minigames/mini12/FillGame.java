package com.javarush.games.minigames.mini12;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class FillGame extends Game {
    private List<Cell> cells = new ArrayList<>();

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        boolean contain=false;
        for(Cell cell:cells){
            if(cell.getX()==x&&cell.getY()==y){ contain=true;break;}
        }
        if(!contain){
            cells.add(new Cell(x,y));
            setCellColor(x,y,Color.ORANGE);
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
       setCellColor(x,y,Color.WHITE);
        for (int i = 0; i < cells.size(); i++) {
            Cell cell = cells.get(i);
            if (cell.getX() == x && cell.getY() == y) {
                cells.remove(cell);
                break;
            }
        }
    }
}
