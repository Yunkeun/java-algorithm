package bakejoon.greedy.수들의합.view;

import bakejoon.greedy.수들의합.utils.InputException;
import java.util.Scanner;

public class InputView {

	private InputView() {
	}

	public static long inputSum(Scanner scanner) {
		String inputNumber = scanner.nextLine();
		InputException.validateNumber(inputNumber);
		return Long.parseLong(inputNumber);
	}
}
