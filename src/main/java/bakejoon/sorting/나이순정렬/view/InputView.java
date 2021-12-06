package bakejoon.sorting.나이순정렬.view;

import bakejoon.sorting.나이순정렬.utils.ExceptionUtil;
import java.util.Scanner;

public class InputView {

	private InputView() {
	}

	public static int getMembersNumber(Scanner scanner) {
		int memberNumber;

		memberNumber = Integer.parseInt(getInput(scanner));
		ExceptionUtil.validateMembersNumber(memberNumber);
		return memberNumber;
	}

	public static String[] getMemberStatus(Scanner scanner) {
		String[] memberStatus;
		int age;
		String name;

		memberStatus = getInput(scanner).split(" ");
		age = getMemberAge(memberStatus);
		name = getMemberName(memberStatus);
		ExceptionUtil.validateMemberAge(age);
		ExceptionUtil.validateMemberName(name);
		return memberStatus;
	}

	public static int getMemberAge(String[] memberStatus) {
		return Integer.parseInt(memberStatus[0]);
	}

	public static String getMemberName(String[] memberStatus) {
		return memberStatus[1];
	}

	public static String getInput(Scanner scanner) {
		return scanner.nextLine();
	}
}
