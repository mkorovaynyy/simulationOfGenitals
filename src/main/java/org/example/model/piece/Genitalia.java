package org.example.model.piece;

import org.example.model.board.Coordinate;
import org.example.model.enums.Gender;

/**
 * Абстрактный родительский класс описывающий гениталии
 */

sealed public abstract class Genitalia permits Penis, Asshole, Vagina {
  protected Gender gender;
  protected Coordinate coordinate;
}
