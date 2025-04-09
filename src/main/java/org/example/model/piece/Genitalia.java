package org.example.model.piece;

import org.example.model.board.Coordinate;
import org.example.model.enums.Gender;

/**
 * Абстрактный родительский класс описывающий гениталии
 */

public abstract class Genitalia {
  protected Gender gender;
  protected Coordinate coordinate;
}
