package day17.task2.mapVersion;

public class ChessBoardMapVersion {
    private ChessMap[][] configuration;

    public ChessBoardMapVersion(ChessMap[][] configuration) {
        this.configuration = configuration;
    }

    public void print() {
        for (ChessMap[] chessMapRow : configuration) {
            for (ChessMap chessMapElement : chessMapRow) {
                chessMapElement.printMap();
            }
            System.out.println();
        }
    }
}
