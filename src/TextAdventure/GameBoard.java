package TextAdventure;

import java.util.Arrays;
import java.util.Random;

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
        final String[] BOARD_ELEMENTS = getCurrentLevel(BoardElements.BOARD_ELEMENTS);
        final int[] BOARD_ELEMENT_COUNTER = getCurrentLevel(BoardElements.BOARD_ELEMENTS_COUNTER);

        for(int element = 0; element<BOARD_ELEMENTS.length; element++){
            for(int counter = 0; counter<BOARD_ELEMENT_COUNTER[element]; counter++){

                // insert current element into empty space on hidden_board
                int[] positions = getEmptySpaceFromBoard();
                hidden_board[positions[0]][positions[1]] = BOARD_ELEMENTS[element];
            }
        }
    }

    private String[] getCurrentLevel(String[][] array){
        return array[LEVEL];
    }
    
    private int[] getCurrentLevel(int[][] array){
        return array[LEVEL];
    }
    
    //loop over random positions until one is empty
    private int[] getEmptySpaceFromBoard(){
        while(true){
            Random randInt = new Random();

            int column = randInt.nextInt(HEIGHT);
            int row = randInt.nextInt(WIDTH);

            if(hidden_board[column][row] == "---"){
                int[] positions = {column, row};
                return positions;
            }
        }
    }
    
    public void printPlayerBoard(){
        for (String[] strings : player_board) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public String getPlayerPosition(){
        return player_board[0][0];
    }
}