package bakejoon.sorting.수정렬하기.model;

import bakejoon.sorting.수정렬하기.utils.ExceptionUtils;

public class Number {

	private int num = 0;

	public Number(int num) {
		ExceptionUtils.validateNumber(num);
		this.num = num;
	}

}
