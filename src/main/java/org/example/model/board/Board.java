package org.example.model.board;
/**
 * Класс для представления игрового поля в виде двумерной доски-квадрата со стороной {@link } sideLengthOfBoard
 */
public class Board {
    //размер стороны двумерной доски квадрата
    private final int sideLengthOfBoard;

    public Board(int sideLengthOfBoard) {
        this.sideLengthOfBoard = sideLengthOfBoard;
    }

    public int getSideLengthOfBoard() {
        return sideLengthOfBoard;
    }
}
