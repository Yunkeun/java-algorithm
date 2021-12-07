package bakejoon.bruteforce.블랙잭.controller;

import bakejoon.bruteforce.블랙잭.models.DealerNumber;
import bakejoon.bruteforce.블랙잭.view.InputView;
import java.util.Scanner;

public class GameController {

	private GameController() {
	}

	public static void playGame(Scanner scanner) {
		DealerNumber dealerNumber;

		dealerNumber = InputView.getDealerNumber(scanner);
	}
}
