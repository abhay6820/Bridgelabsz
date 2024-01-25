import java.util.Random;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        playGame(1); // Single player game
        playGame(2); // Two-player game
    }

    static void playGame(int numPlayers) {
        int[] playerPositions = new int[numPlayers];
        int[] diceRolls = new int[numPlayers];
        int currentPlayer = 0;

        while (true) {
            int diceValue = rollDice();
            diceRolls[currentPlayer]++;
            int option = getOption();

            switch (option) {
                case 0:
                    // No Play
                    break;
                case 1:
                    // Ladder
                    playerPositions[currentPlayer] += diceValue;
                    break;
                case 2:
                    // Snake
                    playerPositions[currentPlayer] -= diceValue;
                    break;
            }

            if (playerPositions[currentPlayer] < 0) {
                playerPositions[currentPlayer] = 0;
            }

            System.out.println("Player " + (currentPlayer + 1) + ": Dice rolled - " + diceValue +
                    ", Option - " + (option == 0 ? "No Play" : (option == 1 ? "Ladder" : "Snake")) +
                    ", New position - " + playerPositions[currentPlayer]);

            if (playerPositions[currentPlayer] == 100) {
                System.out.println("Player " + (currentPlayer + 1) + " wins!");
                break;
            }

            currentPlayer = (currentPlayer + 1) % numPlayers;
        }

        // Report the number of times the dice was played and the positions after every die roll
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + ": Total dice rolls - " + diceRolls[i]);
        }
    }

    static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    static int getOption() {
        Random random = new Random();
        return random.nextInt(3);
    }
}
