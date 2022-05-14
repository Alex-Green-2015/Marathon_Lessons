package day17.task2.v2;

import java.util.Arrays;

import static day17.task2.v2.ChessPiece.*;

public class Task2 {
    public static final int DIMENSION = 100;

    public static void main(String[] args) {
        ChessPiece[][] chessBoardConfiguration = initializeDefaultConfiguration(DIMENSION);
        chessBoardConfiguration[0][0] = ROOK_BLACK;
        chessBoardConfiguration[0][5] = ROOK_BLACK;
        chessBoardConfiguration[0][6] = KING_BLACK;
        chessBoardConfiguration[1][1] = ROOK_WHITE;
        chessBoardConfiguration[1][4] = PAWN_BLACK;
        chessBoardConfiguration[1][5] = PAWN_BLACK;
        chessBoardConfiguration[1][7] = PAWN_BLACK;
        chessBoardConfiguration[2][0] = PAWN_BLACK;
        chessBoardConfiguration[2][2] = KNIGHT_BLACK;
        chessBoardConfiguration[2][6] = PAWN_BLACK;
        chessBoardConfiguration[3][0] = QUEEN_BLACK;
        chessBoardConfiguration[3][3] = BISHOP_WHITE;
        chessBoardConfiguration[4][3] = BISHOP_BLACK;
        chessBoardConfiguration[4][4] = PAWN_WHITE;
        chessBoardConfiguration[5][4] = BISHOP_WHITE;
        chessBoardConfiguration[5][5] = PAWN_WHITE;
        chessBoardConfiguration[6][0] = PAWN_WHITE;
        chessBoardConfiguration[6][3] = QUEEN_WHITE;
        chessBoardConfiguration[6][5] = PAWN_WHITE;
        chessBoardConfiguration[6][7] = PAWN_WHITE;
        chessBoardConfiguration[7][5] = ROOK_WHITE;
        chessBoardConfiguration[7][6] = KING_WHITE;

        ChessBoard chessBoardMap = new ChessBoard(chessBoardConfiguration);
        chessBoardMap.print();
    }

    public static ChessPiece[][] initializeDefaultConfiguration(int dimension) {
        ChessPiece[][] configuration = new ChessPiece[dimension][dimension];
        for (ChessPiece[] chessRow : configuration) {
            Arrays.fill(chessRow, EMPTY);
        }
        return configuration;
    }
}