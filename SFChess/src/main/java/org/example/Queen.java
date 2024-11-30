package org.example;

public class Queen extends ChessPiece {

    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return baseMovementCheck(line, column, toLine, toColumn) &&
                ((Math.abs(line - toLine) == Math.abs(column - toColumn)) ||
                        ((line == toLine) || (column == toColumn)));
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
