package bakejoon.bruteforce.블랙잭.utils;

import bakejoon.bruteforce.블랙잭.models.CardNumbers;

public class ExceptionUtil {

	private static final int MINIMUM_NUMBER_OF_CARDS = 3;
	private static final int MAXIMUM_NUMBER_OF_CARDS = 100;
	private static final int MINIMUM_MAX_NUMBER = 10;
	private static final int MAXIMUM_MAX_NUMBER = 300000;
	private static final int MINIMUM_CARD_NUMBER = 0;
	private static final int MAXIMUM_CARD_NUMBER = 100000;

	private ExceptionUtil() {
	}

	public static void validateNumberOfCardsRange(int numberOfCards) {
		if (numberOfCards < MINIMUM_NUMBER_OF_CARDS || numberOfCards > MAXIMUM_NUMBER_OF_CARDS) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateMaxNumber(int maxNumber) {
		if (maxNumber < MINIMUM_MAX_NUMBER || maxNumber > MAXIMUM_MAX_NUMBER) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateCardNUmber(int cardNumber) {
		if (cardNumber < MINIMUM_CARD_NUMBER || cardNumber > MAXIMUM_CARD_NUMBER) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateCardNumbersSize(int numberOfCards, CardNumbers cardNumbers) {
		if (numberOfCards != cardNumbers.getCardNumbers().size()) {
			throw new IllegalArgumentException();
		}
	}
}
