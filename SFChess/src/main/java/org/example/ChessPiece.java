package org.example;

public abstract class ChessPiece {
    protected String color;
    boolean chk = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();

     static boolean baseMovementCheck(int line, int column, int toLine, int toColumn) {
        return (!(line == toLine && column == toColumn)) &&
                (toLine <= 7 && toLine >= 0 && toColumn <= 7 && toColumn >= 0);
    }

}
