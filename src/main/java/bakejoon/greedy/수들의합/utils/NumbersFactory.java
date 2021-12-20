package bakejoon.greedy.수들의합.utils;

public class NumbersFactory {

	private NumbersFactory() {
	}

	public static int makeMax(int sum) {
		long currentSum = 0;
		int addNumber = 0;
		while (sum >= currentSum) {
			currentSum += (++addNumber);
		}
		if (currentSum == sum) {
			return addNumber;
		}
		return addNumber - 1;
	}
}
