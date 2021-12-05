package bakejoon.sorting.수정렬하기.model;

import bakejoon.sorting.수정렬하기.utils.ExceptionUtils;

public class NumberSize {

	private int numberSize;

	public NumberSize(int numberSize) {
		ExceptionUtils.validateNumber(numberSize);
		this.numberSize = numberSize;
	}

	public int getNum() {
		return numberSize;
	}

}
