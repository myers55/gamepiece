package com.dylan;


public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;
    }
    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public boolean isFrozen() {
        return frozen;
    }

    public void move(int positionX, int positionY){
        if(frozen == false){
            this.positionX  = positionX;
            this.positionY = positionY;
        }
        else {
            System.out.println("You seem to be stuck");
        }
    }

    public boolean freeze(){

        frozen = true;
        return frozen;
    }

    public boolean unfreeze(){

        frozen = false;
        return frozen;
    }
}
