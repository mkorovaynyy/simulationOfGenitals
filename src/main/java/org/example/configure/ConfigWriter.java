package org.example.configure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

/**
 * Утильный класс для записи {@link } boardSize в файл конфигурации
 */

public class ConfigWriter {
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

    public static void setRandomValueForBoardSizeIntoConfig(int maxSize) {
        int boardSize = new Random().nextInt(15, maxSize);
        setBoardSizeIntoConfig(boardSize);
    }
}
