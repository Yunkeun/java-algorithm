package bakejoon.greedy.수들의합.utils;

public class InputException {

	private static final String NUMBER_REGEX = "^[0-9]*$";

	private InputException() {
	}

	public static void validateNumber(String inputNumber) {
		if (checkSpace(inputNumber)) {
			throw new IllegalArgumentException();
		}
		if (!checkNumber(inputNumber)) {
			throw new IllegalArgumentException();
		}
	}

	private static boolean checkSpace(String inputNumber) {
		return inputNumber.isEmpty();
	}

	private static boolean checkNumber(String inputNumber) {
		return inputNumber.matches(NUMBER_REGEX);
	}
}
