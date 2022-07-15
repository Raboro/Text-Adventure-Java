package TextAdventure;

public class BoardElements {
    public static final String[][] BOARD_ELEMENTS = {
            { "-D-", "-F-", "-W-", "-C-", "-O-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-", "-C-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-", "-C-", "-V-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-", "-C-", "-V-" },
            { "-D-", "-F-", "-W-", "-C-", "-O-", "-L-", "-K-", "-Z-", "-A-", "-B-", "-C-", "-V-" }
    };

    public static final int[][] BOARD_ELEMENTS_COUNTER = {
            { 1, 2, 5, 8, 2 },
            { 1, 4, 8, 10, 5, 2 },
            { 1, 4, 18, 10, 8, 5, 2 },
            { 1, 4, 22, 12, 12, 8, 5, 2 },
            { 1, 8, 25, 15, 15, 12, 8, 5, 2 },
            { 1, 8, 25, 15, 15, 12, 12, 8, 5, 2 },
            { 1, 8, 25, 15, 15, 12, 12, 18, 15, 12, 4 },
            { 1, 18, 25, 25, 15, 12, 12, 18, 15, 12, 4, 10 },
            { 1, 18, 25, 25, 15, 12, 12, 58, 15, 52, 4, 30 },
            { 1, 18, 25, 25, 15, 12, 52, 18, 15, 52, 4, 50 }
    };
}