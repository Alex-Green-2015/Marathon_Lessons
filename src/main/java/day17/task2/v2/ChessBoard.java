package day17.task2.v2;

public class ChessBoard {
    private final ChessPiece[][] configuration;

    public ChessBoard(ChessPiece[][] configuration) {
        this.configuration = configuration;
    }

    public void print() {
        for (ChessPiece[] chessRow : configuration) {
            for (ChessPiece chessColumn : chessRow) {
                System.out.print(chessColumn.getSymbol());
            }
            System.out.println();
        }
    }
}