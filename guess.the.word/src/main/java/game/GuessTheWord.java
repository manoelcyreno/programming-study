package game;

import java.util.Scanner;

public class GuessTheWord {

	private boolean play = true;
	private Words randomWord = new Words();
	private Scanner scanner = new Scanner(System.in);
	private int rounds = 10;
	private char lastRound;
	private String usedWords = "";

	void checkInput() {

		boolean isGuessedRight = randomWord.guess(lastRound);

		if (isGuessedRight) {
			if (randomWord.isGuessedRight()) {
				System.out.println("Congrats, you won!");
				System.out.println("The word is: " + randomWord);
				play = false;
			}
		} else {
			if (rounds == 0) {
				System.out.println("Game Over!");
				play = false;
			}
		}
		rounds--;
	}

	public void end() {
		scanner.close();
	}

	void getInput() {

		System.out.print("Enter a letter to guess the word: ");
		String userGuess = scanner.nextLine();
		usedWords += userGuess + ", ";
		lastRound = userGuess.charAt(0);

	}

	void showWord() {
		System.out.println();
		System.out.println("You have " + rounds + " tries left.");
		System.out.println("You already used the letters: " + usedWords);
		System.out.println(randomWord.toString());

	}

	public void start() {

		do {
			showWord();
			getInput();
			checkInput();
		} while (play);
	}

}
