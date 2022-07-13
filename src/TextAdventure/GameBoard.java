package TextAdventure;

import java.util.Arrays;

public class GameBoard {
    private final int WIDTH;
    private final int HEIGHT;
    private final int LEVEL;
    private String[][] player_board;
    private String[][] hidden_board;

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
        //TODO implement Board Elements, which needs to be added to the hidden board on a random position
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