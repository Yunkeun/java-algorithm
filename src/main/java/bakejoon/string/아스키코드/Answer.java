package bakejoon.string.아스키코드;

import java.util.Scanner;

public class Answer {

	private final String input;

	public Answer(Scanner scanner) {
		this.input = scanner.next();
	}

	public int getAsciiCode() {
		return input.charAt(0);
	}
}
