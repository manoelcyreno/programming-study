package game;

import java.util.Scanner;

public class GuessTheWord {

	private boolean play = true;
	private Words randomWord = new Words();
	private Scanner scanner = new Scanner(System.in);
	private int rounds = 5;
	private StringBuilder usedWord = new StringBuilder();
	private boolean isGuessedRight = false;

	void checkInput() {

		if (isGuessedRight) {
			if (randomWord.isGuessedRight()) {
				System.out.println("Congrats, you won!");
				System.out.println("The word is: " + randomWord.showWord());
				play = false;
			}
		} else {
			if (rounds == 1) {
				System.out.println("Game Over! The word is: " + randomWord.showWord());
				play = false;
			}
		}
		rounds--;
	}

	public void end() {

		scanner.close();

	}

	void getInput() {

		System.out.print("Do you want to try to guess a letter(l) or the full word(w)? (type: l or w)");
		String userGuessMethod = scanner.nextLine();

		switch (userGuessMethod) {
		case "l":
			guessLetter();
			break;

		case "w":
			guessWord();
			break;

		default:
			getInput();
			break;
		}
	}

	void guessLetter() {

		System.out.print("Enter a letter to guess the word: ");
		String userGuess = scanner.nextLine();
		usedWord.append(userGuess).append(", ");
		isGuessedRight = randomWord.guess(userGuess.charAt(0));

	}

	void guessWord() {

		System.out.print("Enter the word to guess the word: ");
		String userGuess = scanner.nextLine();
		isGuessedRight = randomWord.guess(userGuess);

	}

	void showWord() {

		System.out.println();
		System.out.println("You have " + rounds + " tries left.");
		System.out.println("You already used the letters: " + usedWord);
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
