package org.example;
public abstract class ChessPiece {

    public boolean chk = true;
    protected String color;

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

    static boolean isPathClear(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine) {
            int step = column < toColumn ? 1 : -1;
            for (int col = column + step; col != toColumn; col += step) {
                if (chessBoard.board[line][col] != null) {
                    return false;
                }
            }
        } else if (column == toColumn) {
            int step = line < toLine ? 1 : -1;
            for (int lin = line + step; lin != toLine; lin += step) {
                if (chessBoard.board[lin][column] != null) {
                    return false;
                }
            }
        } else if (Math.abs(line - toLine) == Math.abs(column - toColumn)) { // Диагонально
            int stepLine = line < toLine ? 1 : -1;
            int stepCol = column < toColumn ? 1 : -1;
            int lin = line + stepLine;
            int col = column + stepCol;
            while (lin != toLine && col != toColumn) {
                if (chessBoard.board[lin][col] != null) {
                    return false;
                }
                lin += stepLine;
                col += stepCol;
            }
        }
        return true;
    }
}