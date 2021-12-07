package bakejoon.bruteforce.블랙잭.models;

import java.util.ArrayList;
import java.util.List;

public class CardNumbers {

	private final List<Integer> cardNumbers;

	public CardNumbers(List<Integer> cardNumbers) {
		this.cardNumbers = cardNumbers;
	}

	public List<Integer> getCardNumbers() {
		return cardNumbers;
	}

	public int getThreeCardsSum(DealerNumber dealerNumber) {
		int maxNumber;
		int sum;
		List<Integer> threeCards;

		maxNumber = dealerNumber.getMaxNumber();
		sum = 0;
		for (int i = 0; i < cardNumbers.size(); i++) {
			for (int j = i; j < cardNumbers.size(); j++) {
				for (int k = j; k < cardNumbers.size(); k++) {
					if (checkSameIndex(i, j, k)) {
						continue;
					}
					threeCards = getThreeCards(i, j, k);
					sum = getSumOfCards(threeCards, sum, maxNumber);
					resetCards(threeCards);
				}
			}
		}
		return sum;
	}

	private List<Integer> getThreeCards(int index1, int index2, int index3) {
		List<Integer> threeCards;

		threeCards = new ArrayList<>();
		threeCards.add(cardNumbers.get(index1));
		threeCards.add(cardNumbers.get(index2));
		threeCards.add(cardNumbers.get(index3));
		return threeCards;
	}

	private boolean checkSameIndex(int index1, int index2, int index3) {
		return index1 == index2 || index2 == index3 || index1 == index3;
	}

	private int getSumOfCards(List<Integer> threeCards, int sum, int maxNumber) {
		int newSum;

		newSum = threeCards.stream().mapToInt(Integer::intValue).sum();
		if (sum < newSum && maxNumber >= newSum) {
			sum = threeCards.stream().mapToInt(Integer::intValue).sum();
		}
		return sum;
	}

	private void resetCards(List<Integer> threeCards) {
		if (!threeCards.isEmpty()) {
			threeCards.clear();
		}
	}
}
