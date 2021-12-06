package bakejoon.sorting.나이순정렬.view;

import bakejoon.sorting.나이순정렬.utils.ExceptionUtil;
import java.util.Scanner;

public class InputView {

	private InputView() {
	}

	public static int getMembersNumber(Scanner scanner) {
		int memberNumber;

		memberNumber = Integer.parseInt(scanner.nextLine());
		ExceptionUtil.validateMembersNumber(memberNumber);
		return memberNumber;
	}
}
