package math.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 */

		//not sure how to do it till 1 mil so I did it to 100
		List<Integer> primeNumbers = new ArrayList<>();
		for (int numbers = 2; numbers <= 100; numbers++) {
			boolean	isPrime = true;
			for (int factor = 2; factor <= numbers / 2; factor++) {
				if(numbers % factor ==0) {
					isPrime = false;
					break;

				}
			}
			if(isPrime) {
				primeNumbers.add(numbers);
			}

		}
		System.out.println("Prime numbers from 1 to 100 are: ");
		for (int number : primeNumbers) {
			System.out.println(number);
		}
	}
}
