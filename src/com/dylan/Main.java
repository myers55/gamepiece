package com.dylan;

public class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();

        gamePiece.isFrozen();
        System.out.println(gamePiece.frozen);

        gamePiece.freeze();
        System.out.println(gamePiece.frozen);

        gamePiece.unfreeze();
        System.out.println(gamePiece.frozen);

        gamePiece.move(1,5);
        System.out.println(gamePiece.getPositionX() + ", " + gamePiece.getPositionY());

        gamePiece.freeze();
        System.out.println(gamePiece.frozen);
        gamePiece.move(5,11);
        System.out.println(gamePiece.getPositionX() + ", " + gamePiece.getPositionY());

        gamePiece.unfreeze();
        gamePiece.move(5,11);
        System.out.println(gamePiece.getPositionX() + ", " + gamePiece.getPositionY());
    }
}
