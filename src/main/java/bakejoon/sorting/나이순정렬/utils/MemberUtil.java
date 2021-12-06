package bakejoon.sorting.나이순정렬.utils;

import bakejoon.sorting.나이순정렬.model.Member;
import bakejoon.sorting.나이순정렬.model.Members;
import bakejoon.sorting.나이순정렬.view.InputView;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberUtil {

	private static final int MINIMUM_MEMBERS_NUMBER = 0;

	private MemberUtil() {
	}

	private static Member createMember(String[] memberInfo) {
		int age;
		String name;

		age = InputView.getMemberAge(memberInfo);
		name = InputView.getMemberName(memberInfo);
		return new Member(age, name);
	}

	public static Members createMembers(Scanner scanner, int membersNumber) {
		List<Member> members;
		String[] memberInfo;
		members = new ArrayList<>();

		for (int i = MINIMUM_MEMBERS_NUMBER; i < membersNumber; i++) {
			memberInfo = InputView.getMemberInfo(scanner);
			members.add(createMember(memberInfo));
		}
		return new Members(members);
	}
}
