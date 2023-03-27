package src.applitoolscourse.finalexercise;

import java.util.Scanner;

public class CoinTossGame {
    private Scanner scan;

    public String askPlayerName() {
        System.out.println("Enter the player's name:");
        return scan.nextLine();
    }

    public String askGuess() {
        String guess;
        System.out.println("What is your Guess (Heads or tails)?");
        guess = scan.nextLine();

        while (!guess.equalsIgnoreCase(Coin.HEADS)
                && !guess.equalsIgnoreCase(Coin.TAILS)) {
            System.out.println("Invalid guess. Try again");
            guess = scan.nextLine();
        }

        return guess;
    }

    public void determineWinner(Player player1, Player player2, Coin coin) {
        if (coin.getSide().equals(player1.getGuess())) {
            System.out.println(player1.getName() + " Wins the game");
        } else {
            System.out.println(player2.getName() + " Wins the game");
        }

    }

    public static void main(String args[]) {
        CoinTossGame game = new CoinTossGame();
        game.scan = new Scanner(System.in);

        System.out.println("########### WELCOME TO COIN FLIP GAME ##########");
        Player player1 = new Player(game.askPlayerName());
        player1.setGuess(game.askGuess());

        Player player2 = new Player(game.askPlayerName());
        if (player1.getGuess().equalsIgnoreCase(Coin.HEADS)) {
            player2.setGuess(Coin.TAILS);
            System.out.println(player2.getName() +
                    " Your Guess is:" + player2.getGuess());
        } else {
            player2.setGuess(Coin.HEADS);
            System.out.println(player2.getName() +
                    " Your Guess is:" + player2.getGuess());
        }

        System.out.println("Flipping the coin.....");
        Coin coin = new Coin();
        coin.flip();
        game.determineWinner(player1, player2, coin);
        game.scan.close();

    }

}
