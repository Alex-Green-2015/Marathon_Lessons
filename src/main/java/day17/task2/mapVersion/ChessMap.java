package day17.task2.mapVersion;

import day17.ChessPiece;

public class ChessMap {
    private ChessPiece chessPiece;
    private int numberOfSpaces;

    public ChessMap(ChessPiece chessPiece, int numberOfSpaces) {
        this.chessPiece = chessPiece;
        this.numberOfSpaces = numberOfSpaces;
    }

    public void printMap() {
        System.out.print(chessPiece.getSymbol());
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.print(ChessPiece.EMPTY.getSymbol());
        }
    }
}
