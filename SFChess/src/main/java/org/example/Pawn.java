package org.example;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean canMove = false;
        if (column == toColumn) {
            if (((color.equals("White") && line == 1) || (color.equals("Black") && line == 6)) &&
                    Math.abs(line - toLine) == 2) {
                canMove = true;
            } else if (Math.abs(line - toLine) == 1) {
                canMove = true;
            }
        }
        return baseMovementCheck(line, column, toLine, toColumn) && canMove;

    }

    @Override
    public String getSymbol() {
        return "P";
    }

}
