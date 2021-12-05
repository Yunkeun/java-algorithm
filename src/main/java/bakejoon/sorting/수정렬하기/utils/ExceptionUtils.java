package bakejoon.sorting.수정렬하기.utils;

public class ExceptionUtils {

	private ExceptionUtils() {

	}
	public static void validateNumber(int number) {
		if (!(number > 0 && number <= 1000)) {
			throw new IllegalArgumentException();
		}
	}
}
