package TextAdventure;

import java.util.Arrays;

public class GameBoard {
    private final int WIDTH;
    private final int HEIGHT;
    private String[][] player_map;
    private String[][] hidden_map;

    public GameBoard(int width, int height){
        this.WIDTH = width;
        this.HEIGHT = height;
        generateMaps();
    }

    private void generateMaps(){
        player_map = new String[HEIGHT][WIDTH];
        hidden_map = new String[HEIGHT][WIDTH];

        for(int column = 0; column < player_map.length; column++){
            for(int row = 0; row < player_map[0].length; row++){
                player_map[column][row] = "---";
                hidden_map[column][row] = "---";
            }
        }

        player_map[0][0] = "-P-";
        hidden_map[0][0] = "-P-";
    }

    public void printPlayerBoard(){
        for (String[] strings : player_map) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public int getWidth(){
        return WIDTH;
    }

}
