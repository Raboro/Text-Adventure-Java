package Testing;

import org.junit.Assert;
import org.junit.Test;

import TextAdventure.GameBoard;

public class TestGameBoard {
    
    @Test
    public void TestGameBoardVar(){
        GameBoard gB = new GameBoard(10, 10);
        Assert.assertEquals(gB.getWidth(), 10);
    }
}
