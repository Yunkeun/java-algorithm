package bakejoon.greedy.수들의합.utils;

public class NumbersFactory {

	private NumbersFactory() {
	}

	public static long makeMax(long sum) {
		long currentSum = 0;
		long addNumber = 0;
		while (sum >= currentSum) {
			currentSum += (++addNumber);
		}
		return addNumber - 1;
	}
}
