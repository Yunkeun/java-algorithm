package bakejoon.bruteforce.블랙잭.view;

import bakejoon.bruteforce.블랙잭.models.DealerNumber;
import java.util.Scanner;

public class InputView {

	private static final int MAX_NUMBER_INDEX = 1;
	private static final int NUMBER_OF_CARDS_INDEX = 0;

	private InputView() {
	}

	public static DealerNumber getDealerNumber(Scanner scanner) {
		String inputNumbers;

		inputNumbers = getInput(scanner);
		return new DealerNumber(getNumberOfCards(inputNumbers), getMaxNumber(inputNumbers));
	}

	public static int getMaxNumber(String inputNumbers) {
		return Integer.parseInt(inputNumbers.split(" ")[MAX_NUMBER_INDEX]);
	}

	public static int getNumberOfCards(String inputNumbers) {
		return Integer.parseInt(inputNumbers.split(" ")[NUMBER_OF_CARDS_INDEX]);
	}

	public static String getInput(Scanner scanner) {
		return scanner.nextLine();
	}
}
