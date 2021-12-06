package bakejoon.sorting.나이순정렬.controller;

import bakejoon.sorting.나이순정렬.view.InputView;
import java.util.Scanner;

public class MemberController {

	private static final int MINIMUM_MEMBERS_NUMBER = 0;

	private MemberController() {
	}

	public static void controlMember(Scanner scanner) {
		int membersNumber;

		membersNumber = InputView.getMembersNumber(scanner);
		for (int i = MINIMUM_MEMBERS_NUMBER; i < membersNumber; i++) {
			InputView.getMemberInfo(scanner);
		}
	}
}
