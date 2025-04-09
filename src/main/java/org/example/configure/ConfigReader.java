package org.example.configure;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Утильный класс для чтения {@link } boardSize из файла конфигурации
 */

public class ConfigReader {
    public static int getBoardSizeFromConfig() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
            return Integer.parseInt(properties.getProperty("boardSize"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
