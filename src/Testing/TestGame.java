package Testing;

import org.junit.Assert;
import org.junit.Test;

import TextAdventure.Game;
import TextAdventure.GameBoard;

public class TestGame {

    @Test
    public void TestRightGameBoard() {
        for (int level = 1; level < 11; level++) {
            Game game = new Game(level);
            GameBoard board = game.getGameBoard();

            Assert.assertEquals("-P-", board.getPlayerPosition());
        }
    }

    @Test
    public void TestLengthCommands() {
        Game game = new Game(1);
        String[] commands = game.getCOMMANDS();
        
        Assert.assertEquals(10, commands.length);
    }

    @Test
    public void TestCommandValues() {
        Game game = new Game(1);
        String[] commands = game.getCOMMANDS();
        String[] expectedCommand = { "help", "printBoard", "left", "right", "up", "down", "printCharacterValues", "printInventar", "getItemInfo", "useItem" };

        for (int index = 0; index < commands.length; index++) {
            Assert.assertEquals(expectedCommand[index], commands[index]);
        }
    }
}
