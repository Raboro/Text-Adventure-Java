package Testing;

import org.junit.Assert;
import org.junit.Test;

import TextAdventure.GameBoard;

public class TestGameBoard {

    @Test
    public void TestPlayerPositionZeroZero() {
        GameBoard gB = new GameBoard(10, 10, 1);
        Assert.assertEquals(gB.getPlayerPosition(), "-P-");
    }
}