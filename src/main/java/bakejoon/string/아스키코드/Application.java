package bakejoon.string.아스키코드;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Answer answer = new Answer(scanner);
		System.out.println(answer.getAsciiCode());
	}
}
