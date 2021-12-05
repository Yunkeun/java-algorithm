package bakejoon.sorting.수정렬하기.controller;

import bakejoon.sorting.수정렬하기.model.Number;
import bakejoon.sorting.수정렬하기.view.InputView;
import java.util.Scanner;

public class NumberController {

	public static void controlNumber(Scanner scanner) {
		Number number = InputView.getNumber(scanner);
	}
}
