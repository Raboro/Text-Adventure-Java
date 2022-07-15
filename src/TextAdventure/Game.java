package TextAdventure;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    private GameBoard gameBoard;
    private final String[] COMMANDS = { "help", "printBoard" };
    private Runnable[] runMethodByCommand = new Runnable[6];
    private boolean dead = false;

    public Game(int level) {
        this.gameBoard = new GameBoard(level * 10, level * 10, level);
        setRunMethodByCommand();
    }

    public boolean loop() {
        while (!dead) {
            int commandPosition = getUserCommand();
            useCommand(commandPosition);
            break;
        }
        return false;
    }

    private void setRunMethodByCommand() {
        runMethodByCommand[0] = new Runnable() { public void run() { help(); } };
        runMethodByCommand[1] = new Runnable() { public void run() { printBoard(); } };
        runMethodByCommand[2] = new Runnable() { public void run() { left(); } };
        runMethodByCommand[3] = new Runnable() { public void run() { right(); } };
        runMethodByCommand[4] = new Runnable() { public void run() { up(); } };
        runMethodByCommand[5] = new Runnable() { public void run() { down(); }};
        runMethodByCommand[6] = new Runnable() { public void run() { printCharacterValues(); }};
        runMethodByCommand[7] = new Runnable() { public void run() { printInventar(); }};
        runMethodByCommand[8] = new Runnable() { public void run() { getItemInfo(); }};
        runMethodByCommand[9] = new Runnable() { public void run() { useItem(); } };

    }

    private int getUserCommand() {
        try (Scanner userInput = new Scanner(System.in)) {
            while (true) {
                System.out.println("[Game ~] $  ");
                String command = userInput.nextLine();

                List<String> commands = Arrays.asList(COMMANDS);
                if (commands.contains(command)) {
                    return commands.indexOf(command);
                }
            }
        }
    }

    private void useCommand(int commandPosition) {
        runMethodByCommand[commandPosition].run();
    }

    private void help() {
        System.out.println("Commands:\n");

        for (String i : COMMANDS) {
            System.out.println("~ " + i);
        }
    }

    private void printBoard() {
        gameBoard.printPlayerBoard();
    }

    private void left() {
        gameBoard.printPlayerBoard();
    }

    private void right() {
        gameBoard.printPlayerBoard();
    }

    private void up() {
        gameBoard.printPlayerBoard();
    }

    private void down() {
        gameBoard.printPlayerBoard();
    }

    private void printCharacterValues() {
        gameBoard.printPlayerBoard();
    }

    private void printInventar() {
        gameBoard.printPlayerBoard();
    }

    private void getItemInfo() {
        gameBoard.printPlayerBoard();
    }

    private void useItem() {
        gameBoard.printPlayerBoard();
    }
}