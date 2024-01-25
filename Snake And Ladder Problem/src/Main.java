import java.util.Random;

class SnakeAndLadderGame {

    public static final int WINNING_POSITION = 100;
    public static final int START_POSITION = 0;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int TOTAL_PLAYERS = 2;

    public static void main(String[] args) {
        int[] playerPositions = new int[TOTAL_PLAYERS];

        int currentPlayer = 0;
        int diceRolls = 0;

        while (playerPositions[currentPlayer] < WINNING_POSITION) {
            int diceValue = rollDice();
            int option = checkOption();
            diceRolls++;

            switch (option) {
                case NO_PLAY:
                    // UC3 - No Play
                    break;
                case LADDER:
                    // UC3 - Ladder
                    playerPositions[currentPlayer] += diceValue;
                    if (playerPositions[currentPlayer] > WINNING_POSITION) {
                        playerPositions[currentPlayer] -= diceValue;
                    }
                    break;
                case SNAKE:
                    // UC3 - Snake
                    playerPositions[currentPlayer] -= diceValue;
                    if (playerPositions[currentPlayer] < START_POSITION) {
                        playerPositions[currentPlayer] = START_POSITION;
                    }
                    break;
            }

            // UC6 - Report the position after every die roll
            System.out.println("Player " + (currentPlayer + 1) + " at position: " + playerPositions[currentPlayer]);

            // UC7 - Switch to the next player if no ladder is encountered
            if (option != LADDER) {
                currentPlayer = (currentPlayer + 1) % TOTAL_PLAYERS;
            }
        }

        // UC6 - Report the number of times the dice was played to win the game
        System.out.println("Number of times dice was played to win: " + diceRolls);

        // UC7 - Report which player won the game
        System.out.println("Player " + (currentPlayer + 1) + " wins!");
    }

    // UC2 - Roll the die to get a number between 1 to 6
    private static int rollDice() {
        return new Random().nextInt(6) + 1;
    }

    // UC3 - Check for Options (No Play, Ladder, Snake)
    private static int checkOption() {
        return new Random().nextInt(3);
    }
}
