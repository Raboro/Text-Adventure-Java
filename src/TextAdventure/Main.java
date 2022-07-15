package TextAdventure;

public class Main {
    public static void main(String[] args) {
        levelLoop();
    }

    private static void levelLoop() {
        for (int level = 1; level < 11; level++) {
            System.out.println("\nLevel " + level + "\n");
            Game game = new Game(level);
            boolean finished_level = game.loop();

            if (!finished_level) {
                break;
            }
        }
    }
}
