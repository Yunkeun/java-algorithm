package bakejoon.greedy.수들의합.view;

import java.util.Scanner;

public class InputView {

	private InputView() {
	}

	public static int inputSum(Scanner scanner) {
		String inputNumber = scanner.nextLine();
		return Integer.parseInt(inputNumber);
	}
}
