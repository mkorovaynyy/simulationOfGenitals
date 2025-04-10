package org.example.configure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

/**
 * Класс для записи {@link } boardSize в файл конфигурации. Здесь все шикарно: можем записать свое значение,
 * а можем поиграть в рулетку и зарандомить это значение. А можем и нихуя не делать.
 */

public class ConfigWriter {

    /**
     * Метод устанавливает значение {@link } boardSize в файле конфиги, равным значению, переданному в параметре.
     */
    public static void setBoardSizeIntoConfig(int boardSize) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
            properties.setProperty("boardSize", String.valueOf(boardSize));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileOutputStream fos = new FileOutputStream("config.properties")) {
            properties.store(fos, "Updated Config");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    /**
     * Метод устанавливает значение {@link } boardSize в файле конфиги, равным рандомнуму значению, в интервале от 15 до
     * значения {@link } maxSize, переданного в параметрах.
     */
    public static void setRandomValueForBoardSizeIntoConfig(int maxSize) {
        int boardSize = new Random().nextInt(15, maxSize);
        setBoardSizeIntoConfig(boardSize);
    }
}
