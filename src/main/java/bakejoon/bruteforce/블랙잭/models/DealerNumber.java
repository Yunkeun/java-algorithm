package bakejoon.bruteforce.블랙잭.models;

import bakejoon.bruteforce.블랙잭.utils.ExceptionUtil;

public class DealerNumber {

	private final int numberOfCards;
	private final int maxNumber;

	public DealerNumber(int numberOfCards, int maxNumber) {
		ExceptionUtil.validateNumberOfCardsRange(numberOfCards);
		ExceptionUtil.validateMaxNumber(maxNumber);
		this.numberOfCards = numberOfCards;
		this.maxNumber = maxNumber;
	}

	public int getNumberOfCards() {
		return numberOfCards;
	}

	public int getMaxNumber() {
		return maxNumber;
	}
}
