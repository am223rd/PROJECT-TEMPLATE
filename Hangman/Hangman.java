package Hangman;

import java.util.Random;

public class Hangman {
	Random random = new Random();
	StringBuffer misses = new StringBuffer("");
	private final String[] Word = { "kind ", "card", "circus", "chicken", "language", "dog", "egg", "dung", "factory",
			"syria", "drill ", "hedgehogs", "family", "dance" };

	public String TheWord;
	char[] Letter;
	int attempets = 0;
	
	public void GameMain() {
		setWord();
		setRow();
		misses.delete(0, misses.length());
		System.out.println("Let´s start a new game" + "\nif you want to exit the game wirte exit");
		

	}

	public void showRow() {
		for (int i = 0; i < Letter.length; i++)
			System.out.print(Letter[i] + " ");
	}

	private void setWord() {
		TheWord = Word[random.nextInt(Word.length)];
	}

	private void setRow() {
		Letter = new char[TheWord.length()];
		for (int i = 0; i < TheWord.length(); i++) {
			Letter[i] = '*';
		}
	}

	public void showMisses() {
		System.out.println(misses);
	}

	public  boolean isCharInWord(char guess) {
		for (int i = 0; i < Letter.length; i++) {
			if (TheWord.charAt(i) == guess) {
				return true;
			
	}
		}
		return false;

	}

	
	
	private void changeRow(char guess) {
		for (int i = 0; i < Letter.length; i++)
			if (TheWord.charAt(i) == guess)
				Letter[i] = TheWord.charAt(i);

	}

	private void addToMisses(char guess) {
		misses.append(guess + " ");
	}

	public void checkRow(char guess) {
		if (isCharInWord(guess)) {
			changeRow(guess);
		} else
			addToMisses(guess);

	}

	public boolean isLooser() {
		if (misses.length() / 2 > 8)
			return true;
		return false;
	}

	public boolean IsWinner() {
		for (int i = 0; i < Letter.length; i++)
			if (Letter[i] == '*')
				return false;
		return true;
	}

	public String getSecretWord() {
		return TheWord;
	}
	public void quit() {
		System.out.println("Game is Over");
		System.exit(0);
	}
}
