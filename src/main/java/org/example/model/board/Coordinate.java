package org.example.model.board;

/**
 * Класс для представления координаты в двумерном пространстве, ограниченном размером стороны квадрата = {@link}boardSize класса {@link }Board.
 */
public class Coordinate {

    //координаты вертикали/горизонтали
    private int x;

    private int y;

    // флаг для индикации занята или свободна координата
    private boolean isTheCoordinateOccupied = true;


}
