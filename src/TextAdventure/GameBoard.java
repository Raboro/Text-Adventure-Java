package TextAdventure;

import java.util.Arrays;

public class GameBoard {
    private final int WIDTH;
    private final int HEIGHT;
    private final int LEVEL;
    private String[][] player_board;
    private String[][] hidden_board;
    private String[] BoardElementsCurrentLevel;
    private int[] BoardElementsCounterCurrentLevel;

    public GameBoard(int width, int height, int level){
        this.WIDTH = width;
        this.HEIGHT = height;
        this.LEVEL = level;
        generateBoards();
        fillHiddenBoard();
    }

    private void generateBoards(){
        player_board = new String[HEIGHT][WIDTH];
        hidden_board = new String[HEIGHT][WIDTH];

        for(int column = 0; column < player_board.length; column++){
            for(int row = 0; row < player_board[0].length; row++){
                player_board[column][row] = "---";
                hidden_board[column][row] = "---";
            }
        }

        player_board[0][0] = "-P-";
        hidden_board[0][0] = "-P-";
    }

    private void fillHiddenBoard(){
        getBoardElements();  
    }

    private void getBoardElements(){
        switch(LEVEL){
            case 1: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelOne();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelOne();
            break;

            case 2: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelTwo();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelTwo();
            break;

            case 3: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelThree();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelThree();
            break;

            case 4: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelFour();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelFour();
            break;

            case 5: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelFive();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelFive();
            break;

            case 6: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelSix();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelSix();
            break;

            case 7: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelSeven();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelSeven();
            break;

            case 8: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelEight();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelEight();
            break;

            case 9: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelNine();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelNine();
            break;

            case 10: 
            BoardElementsCurrentLevel = BoardElements.getBoardElementsCurrentLevelTen();
            BoardElementsCounterCurrentLevel = BoardElements.getBoardElementsCounterCurrentLevelTen();
            break;
            
        }
    }

    public void printPlayerBoard(){
        for (String[] strings : player_board) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public int getWidth(){
        return WIDTH;
    }
}