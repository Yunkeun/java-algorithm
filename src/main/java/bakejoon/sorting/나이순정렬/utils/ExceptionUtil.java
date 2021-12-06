package bakejoon.sorting.나이순정렬.utils;

public class ExceptionUtil {

	private static final int MINIMUM_MEMBERS_NUMBER = 1;
	private static final int MAXIMUM_MEMBERS_NUMBER = 100000;

	private ExceptionUtil() {
	}

	public static void validateMembersNumber(int membersNumber) {
		if (MINIMUM_MEMBERS_NUMBER < 1 || membersNumber > MAXIMUM_MEMBERS_NUMBER) {
			throw new IllegalArgumentException();
		}
	}
}
