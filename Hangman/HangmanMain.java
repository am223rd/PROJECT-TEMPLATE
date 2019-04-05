package Hangman;

import java.util.Scanner;

public class HangmanMain {
	public static void main(String[] args) {

		Hangman game = new Hangman();
		Scanner keyboard = new Scanner(System.in);
		String write;
		char guess;

		game.GameMain();
		do {
			game.showRow();

			System.out.print("\n\nWrong: ");
			game.showMisses();

			System.out.print("\nRight: ");
			write = keyboard.next();

			if (write.equalsIgnoreCase("exit"))
				break;
			else if (write.equalsIgnoreCase("new"))
				game.GameMain();
			else {
				guess = write.charAt(0);
				game.checkRow(guess);

				if (game.isLooser()) {
					System.out.println("\nGame Over!" + game.getSecretWord() + " The game will reboot it self\n");
					game.GameMain();
				}

				else if (game.IsWinner()) {
					System.out.println("GOOD JOBB");
					game.GameMain();
				}

			}

		} while (true);

		System.out.println("\nThank you for playing !");
		keyboard.close();

	}
}
