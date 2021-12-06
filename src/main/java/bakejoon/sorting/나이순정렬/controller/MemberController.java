package bakejoon.sorting.나이순정렬.controller;

import bakejoon.sorting.나이순정렬.model.Members;
import bakejoon.sorting.나이순정렬.utils.MemberUtil;
import bakejoon.sorting.나이순정렬.view.InputView;
import java.util.Scanner;

public class MemberController {

	private MemberController() {
	}

	public static void controlMember(Scanner scanner) {
		Members members;

		members = getMembers(scanner);
		members.sortByAge();
		members.printSortedMember();
	}

	private static Members getMembers(Scanner scanner) {
		int membersNumber;
		Members members;

		membersNumber = InputView.getMembersNumber(scanner);
		members = MemberUtil.createMembers(scanner, membersNumber);
		return members;
	}
}
