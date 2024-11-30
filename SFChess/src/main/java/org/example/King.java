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

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        boolean underAttack = false;

        for (int i = 0; i < 8 && !underAttack; i++) {
            for (int j = 0; j < 8 && !underAttack; j++) {
                if (!board.board[i][j].getColor().equals(color)) {
                    underAttack = board.board[i][j].canMoveToPosition(board, i, j, line, column);
                }
            }
        }
        return underAttack;
    }


}
