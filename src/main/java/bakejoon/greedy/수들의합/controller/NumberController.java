package bakejoon.greedy.수들의합.controller;

import bakejoon.greedy.수들의합.utils.NumbersFactory;
import bakejoon.greedy.수들의합.view.InputView;
import bakejoon.greedy.수들의합.view.OutputView;
import java.util.Scanner;

public class NumberController {

	private NumberController() {
	}

	public static void controlNumber(Scanner scanner) {
		int sum = InputView.inputSum(scanner);
		OutputView.printMax((NumbersFactory.makeMax(sum)));
	}
}
