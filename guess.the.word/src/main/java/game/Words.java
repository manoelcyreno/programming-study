package game;

import java.util.Random;

public class Words {

	private char[] letters;
	private Random random = new Random();
	private String selectedWord;

	private String[] randomWords = { "animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights",
			"properties", "ceremony", "independence", "beneath", "information", "students", "employee" };

	public Words() {
		selectedWord = randomWords[random.nextInt(randomWords.length)];
		letters = new char[selectedWord.length()];
	}

	public boolean guess(char letter) {

		boolean guessedRight = false;

		for (int i = 0; i < selectedWord.length(); i++) {
			if (letter == selectedWord.charAt(i)) {
				letters[i] = letter;
				guessedRight = true;
			}
		}
		return guessedRight;

	}

	public boolean isGuessedRight() {

		for (char letter : letters) {
			if (letter == '\u0000') {
				return false;
			}
		}
		return true;
	}

	public String toString() {

		StringBuilder text = new StringBuilder();

		for (char letter : letters) {

			text.append(letter == '\u0000' ? '-' : letter);
			text.append(' ');
		}

		return text.toString();
	}

}
