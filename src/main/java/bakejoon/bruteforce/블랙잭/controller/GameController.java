package bakejoon.bruteforce.블랙잭.controller;

import bakejoon.bruteforce.블랙잭.models.CardNumbers;
import bakejoon.bruteforce.블랙잭.models.DealerNumber;
import bakejoon.bruteforce.블랙잭.utils.ExceptionUtil;
import bakejoon.bruteforce.블랙잭.view.InputView;
import bakejoon.bruteforce.블랙잭.view.OutputView;
import java.util.Scanner;

public class GameController {

	private GameController() {
	}

	public static void playGame(Scanner scanner) {
		DealerNumber dealerNumber;
		CardNumbers cardNumbers;

		dealerNumber = InputView.getDealerNumber(scanner);
		cardNumbers = InputView.getCardNumbers(scanner);
		ExceptionUtil.validateCardNumbersSize(dealerNumber.getNumberOfCards(), cardNumbers);
		OutputView.printResult(cardNumbers.getThreeCardsSum(dealerNumber));
	}
}
