package org.example;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
/*
        if (!(line == toLine && column == toColumn)) {
            if (toLine <= 7 && toLine >= 0 && toColumn <= 7 && toColumn >= 0) {
                if (!(Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 2)) {
                    if (!(Math.abs(toLine - line) == 1 && Math.abs(column - toColumn) == 1)) {
                        return true;
                    }
                }
            }
        }

 */
        return baseMovementCheck(line, column, toLine, toColumn) &&
                (!(Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 2)) &&
                (!(Math.abs(toLine - line) == 1 && Math.abs(column - toColumn) == 1));
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
