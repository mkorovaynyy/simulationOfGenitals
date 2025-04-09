package org.example.Exception;
/**
 * Класс для представления исключений при попытке изменить размер нашего кастомного List {@link } FixedSizeList
 */
public class FixedSizeListException extends IllegalStateException{
    public FixedSizeListException(String s) {
        super(s);
    }
}
