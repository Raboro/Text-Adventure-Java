package TextAdventure;

import java.util.ArrayList;

public class Inventar {
    private static String[] inventarElements = initInventarElements();
    private static ArrayList<String[]> inventarGui = new ArrayList<>();

    private static String[] initInventarElements() {
        String[] inventarElements = new String[30];
        for (int i = 0; i < inventarElements.length; i++) {
            inventarElements[i] = "---";
        }
        return inventarElements;
    }

    public static ArrayList<String[]> getGui() {
        return reloadGui();
    }

    private static ArrayList<String[]> reloadGui() {
        int counter = 0;

        // loop over 10 lines, every even line is a seperator and the rest are filled
        // with the inventarElements
        for (int line = 0; line < 10; line++) {
            if ((line % 2) == 0) {
                String[] seperator = { "-------------------------" };
                inventarGui.add(seperator);
            } else {
                String[] lineElements = {
                        "|", inventarElements[counter + 0], "|", inventarElements[counter + 1], "|",
                        inventarElements[counter + 2], "|",
                        inventarElements[counter + 3], "|", inventarElements[counter + 4], "|",
                        inventarElements[counter + 5], "|"
                };
                inventarGui.add(lineElements);
                counter += 6;
            }
        }

        return inventarGui;
    }
}