public class IsPrimeNumber {
    // The prime number is a positive integer greater than 1
	// that has exactly two factors, 1 and the number itself.
	private static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		} else if (number == 2) {
			return true;
		} else if (number % 2 == 0) {
			return false;
		} else {
			for (int i = 3; i <= Math.sqrt(number); i += 2)
				if (number % i == 0) return false;
		}

		return true;
	}

    public static void main(String[] args) {
		int number = 11;
		System.out.println(number + (isPrime(number) ? " is a prime number" : " is not a prime number"));
	}
}
