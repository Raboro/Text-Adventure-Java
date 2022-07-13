package TextAdventure;

public class Main {
    public static void main(String[] args) {
        levelLoop();
    }

    private static void levelLoop(){
        for(int level = 1; level<11; level++){
            System.out.println("Level" + level + "\n");
            GameBoard gameBoard = new GameBoard(level*10, level*10, level);
            gameBoard.printPlayerBoard();
            break;
            
            
        }
    }
}

