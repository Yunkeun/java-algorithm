package bakejoon.sorting.나이순정렬;

import bakejoon.sorting.나이순정렬.controller.MemberController;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		MemberController.controlMember(scanner);
	}
}
