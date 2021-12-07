package bakejoon.bruteforce.블랙잭.view;

import bakejoon.bruteforce.블랙잭.models.CardNumbers;
import bakejoon.bruteforce.블랙잭.models.DealerNumber;
import bakejoon.bruteforce.블랙잭.utils.ExceptionUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

	private static final int MAX_NUMBER_INDEX = 1;
	private static final int NUMBER_OF_CARDS_INDEX = 0;
	private static final String SPACE = " ";

	private InputView() {
	}

	public static DealerNumber getDealerNumber(Scanner scanner) {
		String inputNumbers;

		inputNumbers = getInput(scanner);
		return new DealerNumber(getNumberOfCards(inputNumbers), getMaxNumber(inputNumbers));
	}

	private static int getMaxNumber(String inputNumbers) {
		return Integer.parseInt(inputNumbers.split(SPACE)[MAX_NUMBER_INDEX]);
	}

	private static int getNumberOfCards(String inputNumbers) {
		return Integer.parseInt(inputNumbers.split(SPACE)[NUMBER_OF_CARDS_INDEX]);
	}

	public static CardNumbers getCardNumbers(Scanner scanner) {
		List<Integer> cardNumbers;
		String inputNumbers;
		int cardNumber;

		cardNumbers = new ArrayList<>();
		inputNumbers = getInput(scanner);
		for (String number : inputNumbers.split(SPACE)) {
			cardNumber = Integer.parseInt(number);
			ExceptionUtil.validateCardNUmber(cardNumber);
			cardNumbers.add(cardNumber);
		}
		return new CardNumbers(cardNumbers);
	}

	public static String getInput(Scanner scanner) {
		return scanner.nextLine();
	}
}
