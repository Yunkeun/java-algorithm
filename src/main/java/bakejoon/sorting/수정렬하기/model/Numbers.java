package bakejoon.sorting.수정렬하기.model;

import bakejoon.sorting.수정렬하기.utils.ExceptionUtils;
import java.util.Collections;
import java.util.List;

public class Numbers {

	public List<Integer> numbers;

	public Numbers(List<Integer> numbers) {
		ExceptionUtils.validateNumbers(numbers);
		this.numbers = numbers;
	}

	public void sortNumbers() {
		Collections.sort(numbers);
	}
}
