package bakejoon.bruteforce.블랙잭;

import bakejoon.bruteforce.블랙잭.controller.GameController;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GameController.playGame(scanner);
	}

}
