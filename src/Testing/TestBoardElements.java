package Testing;

import org.junit.Assert;
import org.junit.Test;

import TextAdventure.BoardElements;

public class TestBoardElements {

    @Test
    public void TestLengthOfArraysElementsBothTheSame() {
        String[][] BOARD_ELEMENTS = BoardElements.BOARD_ELEMENTS;
        int[][] BOARD_ELEMENTS_COUNTER = BoardElements.BOARD_ELEMENTS_COUNTER;

        for (int position = 0; position < BOARD_ELEMENTS.length; position++) {
            int lengthDifference = BOARD_ELEMENTS[position].length - BOARD_ELEMENTS_COUNTER[position].length;

            Assert.assertEquals(lengthDifference, 0);
        }
    }

    @Test
    public void TestLengthBoardElementsArrays() {
        int[] actual_length = { 5, 6, 7, 8, 9, 10, 11, 12, 12, 12 };
        String[][] BOARD_ELEMENTS = BoardElements.BOARD_ELEMENTS;

        for (int position = 0; position < BOARD_ELEMENTS.length; position++) {
            int length = BOARD_ELEMENTS[position].length;
            Assert.assertEquals(length, actual_length[position]);
        }
    }

    @Test
    public void TestLengthBoardElementsCounterArrays() {
        int[] actual_length = { 5, 6, 7, 8, 9, 10, 11, 12, 12, 12 };
        int[][] BOARD_ELEMENTS_COUNTER = BoardElements.BOARD_ELEMENTS_COUNTER;

        for (int position = 0; position < BOARD_ELEMENTS_COUNTER.length; position++) {
            int length = BOARD_ELEMENTS_COUNTER[position].length;
            Assert.assertEquals(length, actual_length[position]);
        }
    }

    @Test
    public void TestLengthOfArraysBothTheSame() {
        String[][] BOARD_ELEMENTS = BoardElements.BOARD_ELEMENTS;
        int[][] BOARD_ELEMENTS_COUNTER = BoardElements.BOARD_ELEMENTS_COUNTER;

        int lengthDifference = BOARD_ELEMENTS.length - BOARD_ELEMENTS_COUNTER.length;
        Assert.assertEquals(lengthDifference, 0);
    }

    @Test
    public void TestLengthBoardElements() {
        String[][] BOARD_ELEMENTS = BoardElements.BOARD_ELEMENTS;
        Assert.assertEquals(BOARD_ELEMENTS.length, 10);
    }

    @Test
    public void TestLengthBoardElementsCounter() {
        int[][] BOARD_ELEMENTS_COUNTER = BoardElements.BOARD_ELEMENTS_COUNTER;
        Assert.assertEquals(BOARD_ELEMENTS_COUNTER.length, 10);
    }
}