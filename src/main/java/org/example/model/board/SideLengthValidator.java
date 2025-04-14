package org.example.model.board;

/**
 * Класс, содержащий метод для валидации длины стороны квадрата {@link } validate
 */

public class SideLengthValidator {
    /**
     * Метод возвращает true, если переданное в параметр значение {@link } sideLengthOfBoard >=10
     */
    public static boolean validate(int sideLengthOfBoard) {
        return sideLengthOfBoard >= 10;
    }
}
