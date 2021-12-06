package bakejoon.sorting.나이순정렬.model;

import java.util.Comparator;
import java.util.List;

public class Members {

	private final List<Member> members;

	public Members(List<Member> members) {
		this.members = members;
	}

	public void sortByAge() {
		members.sort(Comparator.comparing(Member::getAge));
	}

	public void printSortedMember() {
		members.forEach(Member::printMember);
	}
}
