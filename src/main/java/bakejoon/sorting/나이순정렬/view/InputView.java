package bakejoon.sorting.나이순정렬.view;

import bakejoon.sorting.나이순정렬.utils.ExceptionUtil;
import java.util.Scanner;

public class InputView {

	public static final String SPACE = " ";

	private InputView() {
	}

	public static int getMembersNumber(Scanner scanner) {
		int memberNumber;

		memberNumber = Integer.parseInt(getInput(scanner));
		ExceptionUtil.validateMembersNumber(memberNumber);
		return memberNumber;
	}

	public static String[] getMemberInfo(Scanner scanner) {
		String[] memberInfo;

		memberInfo = getInput(scanner).split(SPACE);
		return memberInfo;
	}

	public static int getMemberAge(String[] memberInfo) {
		return Integer.parseInt(memberInfo[0]);
	}

	public static String getMemberName(String[] memberInfo) {
		return memberInfo[1];
	}

	private static String getInput(Scanner scanner) {
		return scanner.nextLine();
	}
}
