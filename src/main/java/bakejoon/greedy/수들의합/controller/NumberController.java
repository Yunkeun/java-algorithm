package bakejoon.greedy.수들의합.controller;

import bakejoon.greedy.수들의합.view.InputView;
import java.util.Scanner;

public class NumberController {

	private NumberController() {
	}

	public static void controlNumber(Scanner scanner) {
		InputView.inputSum(scanner);
	}
}
