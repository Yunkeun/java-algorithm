package bakejoon.sorting.수정렬하기.utils;

import java.util.List;
import java.util.stream.Collectors;

public class ExceptionUtils {

	private ExceptionUtils() {

	}

	public static void validateNumbersSize(int numbersSize) {
		if (!(numbersSize > 0 && numbersSize <= 1000)) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateNumbers(List<Integer> numbers) {
		for (int number : numbers) {
			if (number < -1000 || number > 1000) {
				throw new IllegalArgumentException();
			}
		}
	}

	public static void validateDuplicatedNumbers(List<Integer> numbers) {
		if(numbers.stream().distinct().count() != numbers.size()) {
			throw new IllegalArgumentException();
		}
	}
}
