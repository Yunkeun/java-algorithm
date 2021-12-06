package bakejoon.sorting.나이순정렬.model;

import bakejoon.sorting.나이순정렬.utils.ExceptionUtil;
import bakejoon.sorting.나이순정렬.view.OutputView;

public class Member {

	private int age;
	private final String name;

	public Member(int age, String name) {
		ExceptionUtil.validateMemberAge(age);
		ExceptionUtil.validateMemberName(name);
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void printMember() {
		OutputView.printMember(age, name);
	}
}
