package org.example.configure;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Класс для чтения {@link } boardSize из файла конфигурации
 */

public class ConfigReader {

    /**
     * Метод возвращает значение {@return } boardSize из файла конфигурации, если его нет возвращает
     * значение по умолчанию {@return }, равное 10
     */
    public static int getBoardSizeFromConfigOrSetThemDefaultValueIfNotFound() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
            if (properties.getProperty("boardSize") != null) {
                return Integer.parseInt(properties.getProperty("boardSize"));
            } else return 10;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
