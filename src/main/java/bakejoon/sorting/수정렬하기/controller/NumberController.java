package bakejoon.sorting.수정렬하기.controller;

import bakejoon.sorting.수정렬하기.model.NumberSize;
import bakejoon.sorting.수정렬하기.model.Numbers;
import bakejoon.sorting.수정렬하기.view.InputView;
import java.util.Scanner;

public class NumberController {

	private NumberController() {
	}

	public static void controlNumber(Scanner scanner) {
		NumberSize numbersSize = InputView.getNumber(scanner);
		Numbers numbers = InputView.getNumbers(scanner, numbersSize);
		numbers.sortNumbers();
		numbers.showNumbers();
	}
}
