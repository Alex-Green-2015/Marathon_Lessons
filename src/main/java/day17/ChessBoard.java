package day17;

public class ChessBoard {
    private ChessPiece[][] configuration;

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
