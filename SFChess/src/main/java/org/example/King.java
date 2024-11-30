package org.example;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return baseMovementCheck(line, column, toLine, toColumn) &&
                ((Math.abs(line - toLine) <= 1) && (Math.abs(column - toColumn) <= 1));
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
