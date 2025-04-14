package org.example.model.board;

import org.example.configure.ConfigReader;

import java.util.Scanner;

/**
 * Класс, содержащий метод для считывания из консоли значения {@link } sideLengthOfBoard
 */
public class ReaderForGetSizeFromConsole {
    public static int getSideLengthFromConsole() {
        int sideLengthOfBoard = ConfigReader.getBoardSizeFromConfigOrSetThemDefaultValueIfNotFound();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите размер стороны доски (>=10): ");
                if (scanner.hasNextInt()) {
                    sideLengthOfBoard = scanner.nextInt();
                    if (SideLengthValidator.validate(sideLengthOfBoard)) {
                        return sideLengthOfBoard;
                    } else {
                        System.out.println("Ошибка: значение должно быть >=10");
                    }
                } else {
                    System.out.println("Ошибка: введено не целое число");
                    scanner.next(); // очистка некорректного ввода
                }
            } catch (Exception e) {
                System.err.println("Произошла ошибка: " + e.getMessage());
                scanner.next(); // очистка некорректного ввода
            }
        }
    }
}



