package org.example;

import org.example.configure.ConfigReader;
import org.example.configure.ConfigWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(ConfigReader.getBoardSizeFromConfig());
        ConfigWriter.setBoardSizeIntoConfig(25);
        System.out.println(ConfigReader.getBoardSizeFromConfig());
        ConfigWriter.setRandomValueForBoardSizeIntoConfig(200);
        System.out.println(ConfigReader.getBoardSizeFromConfig());
        ConfigWriter.setRandomValueForBoardSizeIntoConfig(200);
        System.out.println(ConfigReader.getBoardSizeFromConfig());
        ConfigWriter.setRandomValueForBoardSizeIntoConfig(200);
        System.out.println(ConfigReader.getBoardSizeFromConfig());
    }
}