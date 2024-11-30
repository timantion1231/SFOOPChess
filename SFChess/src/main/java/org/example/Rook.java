package org.example;

public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return baseMovementCheck(line, column, toLine, toColumn) && ((line == toLine) || (column == toColumn));
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
