package org.example;


import org.example.model.board.ReaderForGetSizeFromConsole;
import org.example.model.sprites.SpritesForPenis;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("░░");
        System.out.print(SpritesForPenis.PENIS_LVL_SOLDIER.toString());
        System.out.print("▒▒");
        System.out.print(SpritesForPenis.PENIS_LVL_SERGEANT.toString());
        System.out.print("░░");
        System.out.print(SpritesForPenis.PENIS_LVL_MAJOR.toString());
        System.out.print("▒▒");
        System.out.print(SpritesForPenis.PENIS_LVL_GENERAL.toString());
        System.out.print("░░");

        ReaderForGetSizeFromConsole.getSideLengthFromConsole();


    }
}