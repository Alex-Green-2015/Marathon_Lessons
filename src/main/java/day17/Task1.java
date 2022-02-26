package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessArray = {
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK
        };

        for (ChessPiece chessPiece : chessArray) {
            System.out.print(chessPiece.getSymbol() + " ");
        }
    }
}