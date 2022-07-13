package TextAdventure;

public abstract class BoardElements {
    protected String[] BoardElementsCurrentLevel;
    protected int[] BoardElementsCounterCurrentLevel;
}

class BoardElementsOne extends BoardElements{
    String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-"};
    int[] BoardElementsCounterCurrentLevel = {1, 2, 5, 8, 2};
}

class BoardElementsTwo extends BoardElements{
    String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-"};
    int[] BoardElementsCounterCurrentLevel = {1, 4, 8, 10, 5, 2};
}

class BoardElementsThree extends BoardElements{
    String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-"};
    int[] BoardElementsCounterCurrentLevel = {1, 4, 18, 10, 8, 5, 2};
}

class BoardElementsFour extends BoardElements{
        String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-"};
        int[] BoardElementsCounterCurrentLevel = {1, 4, 22, 12, 12, 8, 5, 2};
}

class BoardElementsFive extends BoardElements{
        String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-"};
        int[] BoardElementsCounterCurrentLevel = {1, 8, 25, 15, 15, 12, 8, 5, 2};
}

class BoardElementsSix extends BoardElements{
        String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-"};
        int[] BoardElementsCounterCurrentLevel = {1, 8, 25, 15, 15, 12, 12, 8, 5, 2};
}

class BoardElementsSeven extends BoardElements{
        String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-", "-C-"};
        int[] BoardElementsCounterCurrentLevel = {1, 8, 25, 15, 15, 12, 12, 18, 15, 12, 4};
}

class BoardElementsEight extends BoardElements{
        String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-", "-C-", "-V-"};
        int[] BoardElementsCounterCurrentLevel = {1, 18, 25, 25, 15, 12, 12, 18, 15, 12, 4, 10};
}

class BoardElementsNine extends BoardElements{
        String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-", "-C-", "-V-"};
        int[] BoardElementsCounterCurrentLevel = {1, 18, 25, 25, 15, 12, 12, 58, 15, 52, 4, 30};
}

class BoardElementsTen extends BoardElements{
        String[] BoardElementsCurrentLevel = {"-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-", "-C-", "-V-"};
        int[] BoardElementsCounterCurrentLevel = {1, 18, 25, 25, 15, 12, 52, 18, 15, 52, 4, 50};
}