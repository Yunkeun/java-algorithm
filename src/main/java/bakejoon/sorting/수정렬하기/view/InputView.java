package bakejoon.sorting.수정렬하기.view;

import bakejoon.sorting.수정렬하기.model.NumberSize;
import bakejoon.sorting.수정렬하기.model.Numbers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

	private final static int MINIMUM_INDEX_LOOP = 0;

	private InputView() {
	}

	public static NumberSize getNumber(Scanner scanner) {
		int number = Integer.parseInt(getInput(scanner));
		return new NumberSize(number);
	}

	public static Numbers getNumbers(Scanner scanner, NumberSize number) {
		List<Integer> numbers;

		numbers = new ArrayList<>();
		for (int i = MINIMUM_INDEX_LOOP; i < number.getNum(); i++) {
			numbers.add(Integer.parseInt(getInput(scanner)));
		}
		return new Numbers(numbers);
	}

	public static String getInput(Scanner scanner) {
		return scanner.nextLine();
	}
}
