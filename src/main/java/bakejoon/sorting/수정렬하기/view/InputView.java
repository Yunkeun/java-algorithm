package bakejoon.sorting.수정렬하기.view;

import bakejoon.sorting.수정렬하기.model.Number;
import java.util.Scanner;

public class InputView {

	public static Number getNumber(Scanner scanner) {
		int number = Integer.parseInt(getInput(scanner));
		return new Number(number);
	}

	public static String getInput(Scanner scanner) {
		return scanner.nextLine();
	}
}
