package Testing;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

import TextAdventure.Inventar;

public class TestInventar {

    @Test
    public void TestLengthInventarGui() {
        ArrayList<String[]> inventar = Inventar.getGui();
        Assert.assertEquals(10, inventar.size());
    }

    @Test
    public void TestSeperatingLinesAreEqual() {
        ArrayList<String[]> inventar = Inventar.getGui();

        for (int line = 0; line < inventar.size(); line++) {
            if ((line % 2) == 0) {
                String[] element = inventar.get(line);
                Assert.assertEquals("-------------------------", element[0]);
            }
        }
    }

    @Test
    public void TestFormatingOfLinesWithData() {
        ArrayList<String[]> inventar = Inventar.getGui();

        for (int line = 0; line < inventar.size(); line++) {
            if ((line % 2) != 0) {
                String[] element = inventar.get(line);

                for (int index = 0; index < element.length; index++) {
                    if ((index % 2) == 0) {
                        Assert.assertEquals("|", element[index]);
                    }
                }
            }
        }
    }
}