import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String args[]) {

		List<Integer> primes = getPrimesBetween(0, 49);
		int primesSum = addNumbers(primes);
		System.out.println(">Suma de los números primos que hay entre los 50 primeros números:");
		System.out.println("-Resultado: " + primesSum);
		System.out.println("-Primos usados: " + primes.toString());

		System.out.println();

		primes = getFirstNPrimes(50);
		primesSum = addNumbers(primes);
		System.out.println(">Suma de los 50 primeros números primos:");
		System.out.println("-Resultado: " + primesSum);
		System.out.println("-Primos usados: " + primes.toString());
	}

	private static List<Integer> getPrimesBetween(int minIncluded, int maxIncluded) {
		assert minIncluded >= 0;
		assert maxIncluded > minIncluded;

		List<Integer> primeList = new ArrayList<Integer>();

		for (int i = minIncluded; i <= maxIncluded; i++) {
			if (isPrime(i)) {
				primeList.add(i);
			}
		}

		return primeList;
	}

	private static List<Integer> getFirstNPrimes(int n) {
		assert n > 0;

		List<Integer> primeList = new ArrayList<Integer>();
		int naturalNumber = 2;

		while (primeList.size() < n) {

			if (isPrime(naturalNumber)) {
				primeList.add(naturalNumber);
			}

			naturalNumber++;
		}

		return primeList;
	}

	private static int addNumbers(List<Integer> numberList) {
		assert numberList != null;

		int sum = 0;

		for (Integer number : numberList) {
			sum += number;
		}

		return sum;
	}

	private static boolean isPrime(int number) {
		assert number >= 0;
		
		final int FIRST_PRIME_NUMBER = 2;  

		if (number == 0 || number == 1) {
			return false;
		}

		for (int i = FIRST_PRIME_NUMBER; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
