package bakejoon.sorting.나이순정렬.controller;

import bakejoon.sorting.나이순정렬.model.Member;
import bakejoon.sorting.나이순정렬.model.Members;
import bakejoon.sorting.나이순정렬.view.InputView;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberController {

	private static final int MINIMUM_MEMBERS_NUMBER = 0;

	private MemberController() {
	}

	public static void controlMember(Scanner scanner) {
		int membersNumber;
		Members members;

		membersNumber = InputView.getMembersNumber(scanner);
		members = getMembers(scanner, membersNumber);
		members.sortByAge();
		members.printSortedMember();
	}

	public static Member getMember(String[] memberInfo) {
		int age;
		String name;

		age = InputView.getMemberAge(memberInfo);
		name = InputView.getMemberName(memberInfo);
		return new Member(age, name);
	}

	public static Members getMembers(Scanner scanner, int membersNumber) {
		List<Member> members;
		String[] memberInfo;
		members = new ArrayList<>();

		for (int i = MINIMUM_MEMBERS_NUMBER; i < membersNumber; i++) {
			memberInfo = InputView.getMemberInfo(scanner);
			members.add(getMember(memberInfo));
		}
		return new Members(members);
	}
}
