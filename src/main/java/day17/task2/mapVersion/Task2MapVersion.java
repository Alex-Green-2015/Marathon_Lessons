package day17.task2.mapVersion;

import day17.ChessPiece;

import static day17.ChessPiece.*;

public class Task2MapVersion {
    public static void main(String[] args) {
        ChessMap[][] chessBoardConfiguration = {
                {addPieceWithSpaces(ROOK_BLACK, 4), addSingle(ROOK_BLACK), addPieceWithSpaces(KING_BLACK, 1)},
                {addSpaces(1), addPieceWithSpaces(ROOK_WHITE, 2), addSingle(PAWN_BLACK), addPieceWithSpaces(PAWN_BLACK, 1), addSingle(PAWN_BLACK)},
                {addPieceWithSpaces(PAWN_BLACK, 1), addPieceWithSpaces(KNIGHT_BLACK, 3), addPieceWithSpaces(PAWN_BLACK, 1)},
                {addPieceWithSpaces(QUEEN_BLACK, 2), addPieceWithSpaces(BISHOP_WHITE, 4)},
                {addSpaces(3), addSingle(BISHOP_BLACK), addPieceWithSpaces(PAWN_WHITE, 3)},
                {addSpaces(4), addSingle(BISHOP_WHITE), addPieceWithSpaces(PAWN_WHITE, 2)},
                {addPieceWithSpaces(PAWN_WHITE, 2), addPieceWithSpaces(QUEEN_WHITE, 1), addPieceWithSpaces(PAWN_WHITE, 1), addSingle(PAWN_WHITE)},
                {addSpaces(5), addSingle(ROOK_WHITE), addPieceWithSpaces(KING_WHITE, 1)}
        };

        ChessBoardMapVersion chessBoardMap = new ChessBoardMapVersion(chessBoardConfiguration);
        chessBoardMap.print();
    }

    public static ChessMap addSingle(ChessPiece chessPiece) {
        return new ChessMap(chessPiece, 0);
    }

    public static ChessMap addPieceWithSpaces(ChessPiece chessPiece, int numberOfSpaces) {
        return new ChessMap(chessPiece, numberOfSpaces);
    }

    public static ChessMap addSpaces(int numberOfSpaces) {
        return new ChessMap(EMPTY, numberOfSpaces - 1);
    }

}
