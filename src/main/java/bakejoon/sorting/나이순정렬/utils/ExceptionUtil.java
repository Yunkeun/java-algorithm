package bakejoon.sorting.나이순정렬.utils;

public class ExceptionUtil {

	private static final int MINIMUM_MEMBERS_NUMBER = 1;
	private static final int MAXIMUM_MEMBERS_NUMBER = 100000;
	private static final int MINIMUM_MEMBER_AGE = 1;
	private static final int MAXIMUM_MEMBER_AGE = 200;
	private static final int MAXIMUM_MEMBER_NAME_LENGTH = 100;

	private ExceptionUtil() {
	}

	public static void validateMembersNumber(int membersNumber) {
		if (membersNumber < MINIMUM_MEMBERS_NUMBER || membersNumber > MAXIMUM_MEMBERS_NUMBER) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateMemberInfo(String[] memberInfo) {
		if (memberInfo[0].isEmpty() || memberInfo[1].isEmpty()) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateMemberAge(int age) {
		if (age < MINIMUM_MEMBER_AGE || age > MAXIMUM_MEMBER_AGE) {
			throw new IllegalArgumentException();
		}
	}

	public static void validateMemberName(String name) {
		if (name.length() > MAXIMUM_MEMBER_NAME_LENGTH) {
			throw new IllegalArgumentException();
		}
	}
}
